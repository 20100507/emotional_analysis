package org.bianqi.thread;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;

import org.bianqi.entity.comment.CommentBean;
import org.bianqi.entity.comment.Comments;
import org.bianqi.entity.comment.User;
import org.bianqi.utils.EncryptUtils;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CommonThread implements Runnable{
	
	private long pageSize = 0;
	
	private long songId = 483671599;
	
	@Override
	public void run() {
		
		for(int i = 0;i <= pageSize;i++){
			try{
				String secKey = new BigInteger(100, new SecureRandom()).toString(32).substring(0, 16);//limit
				String encText = EncryptUtils.aesEncrypt(EncryptUtils.aesEncrypt("{\"offset\":"+ i * 10 +",\"limit\":"+(i+1) * 10+"};","0CoJUm6Qyw8W8jud"), secKey);
		        String encSecKey = EncryptUtils.rsaEncrypt(secKey);
			    Response execute = Jsoup.connect("http://music.163.com/weapi/v1/resource/comments/R_SO_4_"+songId)
						.data("params",encText)
						.data("encSecKey",encSecKey)
						.method(Method.POST).ignoreContentType(true).timeout(2000000000).execute();
				String string = execute.body().toString();
				System.out.println(string);
				ObjectMapper objectMapper = new ObjectMapper();
				CommentBean readValue = objectMapper.readValue(string.getBytes(), CommentBean.class);
				long total = readValue.getTotal();
				pageSize = total / 10;
				List<Comments> comments = readValue.getComments();
				for (Comments comments2 : comments) {
					String content = comments2.getContent();
					long time = comments2.getTime();
					User user = comments2.getUser();
					String avatarUrl = user.getAvatarUrl();
					String nickname = user.getNickname();
					long userId = user.getUserId();
					//=========================================数据持久化==========================
					System.out.println("昵称:"+nickname+"评论内容为："+content+"评论时间为:"+time+"头像地址"+avatarUrl+"用户的ID"+userId);
				}
			}catch(Exception e){
			}
		  }
		}
}





