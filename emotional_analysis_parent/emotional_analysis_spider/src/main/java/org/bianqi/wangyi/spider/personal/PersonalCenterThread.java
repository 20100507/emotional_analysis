package org.bianqi.wangyi.spider.personal;

import java.util.List;

import org.apache.log4j.Logger;
import org.bianqi.wangyi.entity.personal.Creator;
import org.bianqi.wangyi.entity.personal.PersonalData;
import org.bianqi.wangyi.entity.personal.Playlist;
import org.bianqi.wangyi.task.ThreadTask;
import org.bianqi.wangyi.utils.CenterUrl;
import org.bianqi.wangyi.utils.FileSourceUtils;
import org.bianqi.wangyi.utils.JsonParseUtil;

/**
 * 采集个人中心数据[图计算数据采集]
 * <p>Title: PersonalCenterThread</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月2日上午11:53:22
 * @version 1.0.0
 */
public class PersonalCenterThread extends ThreadTask {
	
	public static final Logger logger = Logger.getLogger(PersonalCenterThread.class);
	
	public PersonalCenterThread(long uid) {
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
					Playlist playlist2 = playlist.get(0);
					Creator creator = playlist2.getCreator();
					if(creator != null){
						long birthday = creator.getBirthday();
						String nickname = creator.getNickname();
						long province = creator.getProvince();
						int gender = creator.getGender();
						long city = creator.getCity();
						StringBuffer stringBuffer = new StringBuffer();
						stringBuffer.append(uid);
						stringBuffer.append(",");
						stringBuffer.append(birthday);
						stringBuffer.append(",");
						stringBuffer.append(nickname);
						System.out.println("+++++++++++++++++++"+uid+"+++++++"+gender+"++++++++++");
						stringBuffer.append(",");
						stringBuffer.append(province);
//						stringBuffer.append(",");
//						stringBuffer.append(avatarUrl);
//						stringBuffer.append(",");
//						stringBuffer.append(backgroundUrl);
						stringBuffer.append(",");
						stringBuffer.append(gender);
						stringBuffer.append(",");
						stringBuffer.append(city);
						FileSourceUtils fsu = new FileSourceUtils();
//						logger.error(uid+"\t"+nickname);
						fsu.importData(stringBuffer.toString(),"personal");
//						fsu.importData(uid+","+nickname, "users");
					}
				  }
				}
		}catch(Exception e){
			System.err.println("404该用户不存在！！！！！！！！！！！！！");
		}
	}
}
