package org.bianqi.wangyi.spider.comments;

import java.util.List;

import org.apache.log4j.Logger;
import org.bianqi.wangyi.entity.comment.CommentBean;
import org.bianqi.wangyi.entity.comment.Comments;
import org.bianqi.wangyi.task.ThreadTask;
import org.bianqi.wangyi.utils.CenterUrl;
import org.bianqi.wangyi.utils.FileSourceUtils;
import org.bianqi.wangyi.utils.IKAnalyzerUtils;
import org.bianqi.wangyi.utils.JsonParseUtil;
import org.wltea.analyzer.lucene.IKAnalyzer;

/**
 * 评论数据采集[IK分词器切分]
 * <p>Title: CommentThread</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月18日下午2:31:02
 * @version 1.0.0
 */
public class CommentThread extends ThreadTask {
	
	public static final Logger logger=Logger.getLogger(CommentThread.class);
	public IKAnalyzer analyzer = new IKAnalyzer();
	
	public CommentThread(long uid) {
		super(uid);
	}

	@Override
	public void run() {
		long pageSize = 0;
		for (long i = 0; i <= pageSize; ) {
			if (i % 2 == 0) {
				try {
					String url = "http://music.163.com/weapi/v1/resource/comments/R_SO_4_"
							+ uid;
					String data = CenterUrl.getDataByUrl(url, "{\"offset\":" + i * 10 + ",\"limit\":"+ 10 + "};");
					System.out.println(data);
					JsonParseUtil<CommentBean> commentData = new JsonParseUtil<>();
					CommentBean jsonData = commentData.getJsonData(data, CommentBean.class);
					long total = jsonData.getTotal();
					pageSize = total / 10;
					List<Comments> comments = jsonData.getComments();
					for (Comments comments2 : comments) {
						List<String> keysList = IKAnalyzerUtils.printAnalysisResult(analyzer, comments2.getContent());
						StringBuilder sb = new StringBuilder("");
						for (String key : keysList) {
							sb.append(key+" ");
						}
						if(!sb.toString().trim().equals("")){
							new FileSourceUtils().importData(uid+"\t"+comments2.getCommentId()+"\t"+comments2.getTime()+"\t"+sb.toString(), "comments");
						}
//						logger.error(uid+"\t"+comments2.getCommentId()+"\t"+comments2.getTime()+"\t"+sb.toString());
					}
				} catch (Exception e) {
				}
			}
		}
	}
}