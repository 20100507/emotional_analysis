package org.bianqi.followering;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.bianqi.utils.EncryptUtils;
import org.bianqi.wangyi.utils.FileSourceUtils;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.junit.Test;

/**
 * 关注者
 * @author dhc
 */
public class FollowingTest {
	
	@Test
	public void test3() throws Exception {
		String secKey = new BigInteger(100, new SecureRandom()).toString(32).substring(0, 16);
		String encSecKey = EncryptUtils.rsaEncrypt(secKey);
		String encText = EncryptUtils.aesEncrypt(
				EncryptUtils.aesEncrypt("{\"userId\":63362967,\"offset\":0,\"limit\":100};", "0CoJUm6Qyw8W8jud"),
				secKey);
		Response execute = Jsoup.connect("http://music.163.com/weapi/user/getfolloweds").data("params", encText)
				.data("encSecKey", encSecKey).method(Method.POST).ignoreContentType(true).execute();
//		String string = execute.body().toString();
//		System.out.println(string);
//		System.out.println(string.equals("{\"code\":200,\"more\":false,\"followeds\":[]}"));
//		new FileSourceUtils().importData(string, "follow");
		int i = 0;
		while (true) {
			encText = EncryptUtils.aesEncrypt(
					EncryptUtils.aesEncrypt("{\"userId\":92271210,\"offset\":" + i + ",\"limit\":" + 100 + "};",
							"0CoJUm6Qyw8W8jud"),
					secKey);
			execute = Jsoup.connect("http://music.163.com/weapi/user/getfolloweds").data("params", encText)
					.data("encSecKey", encSecKey).method(Method.POST).ignoreContentType(true).execute();
			String string1 = execute.body().toString();
			if(string1.equals("") || i == 1000){
				break;
			}
			System.out.println(string1);
			new FileSourceUtils().importData(string1,"follow");
			i += 100;
		}
	}

}
