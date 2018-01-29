package org.bianqi.wangyi.spider.followers;

import java.util.List;
import java.util.concurrent.Callable;

import org.bianqi.wangyi.entity.followed.FollowedBean;
import org.bianqi.wangyi.entity.followed.Followeds;
import org.bianqi.wangyi.entity.followers.Follow;
import org.bianqi.wangyi.entity.followers.FollowersBean;
import org.bianqi.wangyi.entity.personal.PersonalData;
import org.bianqi.wangyi.task.ThreadTask;
import org.bianqi.wangyi.utils.CenterUrl;
import org.bianqi.wangyi.utils.FileSourceUtils;
import org.bianqi.wangyi.utils.JsonParseUtil;

/**
 * 关注者
 * <p>Title: FollowersThread</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月4日下午12:20:13
 * @version 1.0.0
 */
public class FollowersThread extends ThreadTask {

	public FollowersThread(long uid) {
		super(uid);
	}

	@Override
	public void run(){
		try {
			try {
				String url = "http://music.163.com/weapi/user/getfollows/"+uid;
				String data = "";
				int i = 0;
				while(true){
					data = CenterUrl.getDataByUrl(url, "{\"offset\":"+i+",\"limit\":"+100+"};");
					System.out.println(data);
					if(data.equals("") || i == 1000){
						break;
					}
					JsonParseUtil<FollowersBean> commentData = new JsonParseUtil<>();
					FollowersBean follows = commentData.getJsonData(data, FollowersBean.class);
					List<Follow> followList = follows.getFollow();
					FileSourceUtils fileSourceUtils = new FileSourceUtils();
					for (Follow follow : followList) {
						int userId = follow.getUserId();
						fileSourceUtils.importData(userId+" "+uid, "followers");
					}
					i += 100;
				}
			} catch (Exception e) {
			}

		} catch (Exception e) {
		}

	}

}
