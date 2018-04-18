package org.bianqi.wangyi.spider.followed;

import java.util.List;

import org.bianqi.wangyi.entity.followed.FollowedBean;
import org.bianqi.wangyi.entity.followed.Followeds;
import org.bianqi.wangyi.task.ThreadTask;
import org.bianqi.wangyi.utils.CenterUrl;
import org.bianqi.wangyi.utils.FileSourceUtils;
import org.bianqi.wangyi.utils.JsonParseUtil;


/**
 * 被关注者
 * <p>Title: FollowedThread</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月4日下午12:19:17
 * @version 1.0.0
 */
public class FollowedThread extends ThreadTask {


	public FollowedThread(long uid) {
		super(uid);
	}

	@Override
	public void run() {
		try {
			String url = "http://music.163.com/weapi/user/getfolloweds";
			String data = "";
			int i = 0;
			while (true) {
				data = CenterUrl.getDataByUrl(url,
						"{\"userId\":" + uid + ",\"offset\":" + i + ",\"limit\":" + (i + 100) + "};");
				System.out.println(data);
				if (data.equals("") || i == 1000) {
					break;
				}
				JsonParseUtil<FollowedBean> commentData = new JsonParseUtil<>();
				FollowedBean commentJson = commentData.getJsonData(data, FollowedBean.class);
				List<Followeds> followeds = commentJson.getFolloweds();
				for (Followeds followed : followeds) {
					long userId = followed.getUserId();
					new FileSourceUtils().importData(uid + "," + userId, "follower");
				}
				i += 100;
			}
		} catch (Exception e) {
		}
	}

}
