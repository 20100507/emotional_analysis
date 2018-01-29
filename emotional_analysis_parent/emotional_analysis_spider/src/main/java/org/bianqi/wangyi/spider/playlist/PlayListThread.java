package org.bianqi.wangyi.spider.playlist;

import java.util.List;

import org.bianqi.wangyi.entity.personal.PersonalData;
import org.bianqi.wangyi.entity.personal.Playlist;
import org.bianqi.wangyi.task.ThreadTask;
import org.bianqi.wangyi.utils.CenterUrl;
import org.bianqi.wangyi.utils.FileSourceUtils;
import org.bianqi.wangyi.utils.JsonParseUtil;

/**
 * 抓取用户的标签 人物画像标签
 * <p>Title: PlayListThread</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月22日下午4:08:48
 * @version 1.0.0
 */
public class PlayListThread extends ThreadTask{
	
	
	public PlayListThread(long uid) {
		super(uid);
	}

	@Override
	public void run(){
		try{
			JsonParseUtil<PersonalData> personData = new JsonParseUtil<>();
			String url = "http://music.163.com/weapi/user/playlist";
			String data = CenterUrl.getDataByUrl(url, "{\"uid\":"+uid+",\"offset\":0,\"limit\":50};");
			PersonalData jsonData = personData.getJsonData(data, PersonalData.class);
			if(jsonData != null){
				List<Playlist> playlist = jsonData.getPlaylist();
				if(playlist != null && playlist.size() > 0){
					for (Playlist list : playlist) {
						List<String> tags = list.getTags();
						if(tags != null && tags.size() > 0){
							for (String tag : tags) {
								new FileSourceUtils().importData(uid+","+tag, "usertag");
							}
						}
					  }
					}
				}
		}catch(Exception e){
			System.err.println("404该用户不存在！！！！！！！！！！！！！");
		}
	}
}
