package org.bianqi.followering;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

import org.bianqi.utils.EncryptUtils;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.junit.Test;

/**
 * 关注者
 * @author dhc
 *
 */
public class FollowingTest {
	
	@Test
	public void test3() throws Exception{
			String secKey = new BigInteger(100, new SecureRandom()).toString(32).substring(0, 16);
	        String encText = EncryptUtils.aesEncrypt(EncryptUtils.aesEncrypt("{\"offset\":0,\"limit\":50};","0CoJUm6Qyw8W8jud"), secKey);
	        String encSecKey = EncryptUtils.rsaEncrypt(secKey);
		    Response execute = Jsoup.connect("http://music.163.com/weapi/user/getfolloweds")
					.data("params",encText)
					.data("encSecKey",encSecKey)
					.method(Method.POST).ignoreContentType(true).execute();
			String string = execute.body().toString();
			System.out.println(string);
	}
	
	
	
}
