package org.bianqi.wangyi.spider.comments;

import java.util.List;

import org.apache.log4j.Logger;
import org.bianqi.wangyi.entity.comment.CommentBean;
import org.bianqi.wangyi.entity.comment.HotComments;
import org.bianqi.wangyi.task.ThreadTask;
import org.bianqi.wangyi.utils.CenterUrl;
import org.bianqi.wangyi.utils.JsonParseUtil;

/**
 * 抓取热门评论
 * <p>Title: HotCommentsThread</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月17日下午11:23:12
 * @version 1.0.0
 */
public class HotCommentsThread extends ThreadTask{
	
	public static final Logger logger=Logger.getLogger(HotCommentsThread.class);

	public HotCommentsThread(long uid) {
		super(uid);
	}

	@Override
	public void run() {
		try{
					String url = "http://music.163.com/weapi/v1/resource/comments/R_SO_4_" + uid;
					String data = CenterUrl.getDataByUrl(url, "{\"offset\":0,\"limit\":10};");
					System.out.println(data);
					JsonParseUtil<CommentBean> commentData = new JsonParseUtil<>();
					CommentBean jsonData = commentData.getJsonData(data, CommentBean.class);
					List<HotComments> hotComments = jsonData.getHotComments();
					for (HotComments hotComments2 : hotComments) {
						String message = "{\"songId\":"+uid+",\"userId\":"+hotComments2.getUser().getUserId()+",\"content\":\""+hotComments2.getContent()+"\",\"count\":"+hotComments2.getLikedCount()+"}";
						System.err.println(message);
						logger.error(message);
					}
				} catch (Exception e) {
				}
		}
}
