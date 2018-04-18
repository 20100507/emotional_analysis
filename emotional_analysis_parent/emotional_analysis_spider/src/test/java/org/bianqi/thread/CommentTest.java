package org.bianqi.thread;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

import org.bianqi.utils.EncryptUtils;
import org.bianqi.wangyi.proxy.IpProxy;
import org.bianqi.wangyi.utils.CenterUrl;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;

public class CommentTest {
	
	
	public static void main(String[] args) {
//		for(int i = 138789;i < 139989;i++){
//			try{
//				System.setProperty("http.maxRedirects", "5000");
//				System.getProperties().setProperty("proxySet", "true");
//				// 如果不设置，只要代理IP和代理端口正确,此项不设置也可以
//				System.getProperties().setProperty("http.proxyHost", "124.79.56.115");
//				System.getProperties().setProperty("http.proxyPort", "8118");
//				String secKey = new BigInteger(100, new SecureRandom()).toString(32).substring(0, 16);//limit
//				String encText = EncryptUtils.aesEncrypt(EncryptUtils.aesEncrypt("{\"offset\":0,\"limit\":10};","0CoJUm6Qyw8W8jud"), secKey);
//		        String encSecKey = EncryptUtils.rsaEncrypt(secKey);
//			    Response execute = Jsoup
//			    		.connect("https://music.163.com/weapi/v1/resource/comments/R_SO_4_"+i)
//			    		.header("User-Agent",
//								"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.32 (KHTML, like Gecko) Chrome/61.0.3163.79 Safari/537.36")
//						.header("Cache-Control", "max-age=60").header("Accept", "*/*")
//						.header("Accept-Language", "zh-CN,zh;q=0.8,en;q=0.6").header("Connection", "keep-alive")
//						.header("Referer", "http://music.163.com/song?id=2332323")
//						.header("Origin", "http://music.163.com").header("Host", "music.163.com")
//						.header("Content-Type", "application/x-www-form-urlencoded")
//								.data("params",encText)
//						.data("encSecKey",encSecKey)
//						.method(Method.POST).ignoreContentType(true).timeout(2000000000)
//						.execute();
//				String string = execute.body().toString();
//				System.out.println(string);
////				IpProxy.timerGetIps();
////				String url = "http://music.163.com/weapi/v1/resource/comments/R_SO_4_" + i;
////				String data = CenterUrl.getDataByUrl(url, "{\"offset\":0,\"limit\":10};");
////				System.out.println(data);
//			}catch(Exception e){
//				e.printStackTrace();
//			}
//		}
		
		try {
			Response execute = Jsoup.connect("https://api.weibo.cn/2/cardlist?networktype=wifi&uicode=10000198"
					+ "&moduleID=708&featurecode=10000085"
					+ "&wb_version=3523"
					+ "&lcardid=1003030212_seqid%3A1671487208%7Ctype%3A3%7Ct%3A0%7Cpos%3A1-0-0%7Cq%3A%E6%9D%A8%E5%B9%82%7Cext%3A%26uid%3D1195242865%26&c=android&i=a032269&s=7f0ba7d8&ft=0&ua=Honor-CHM-TL00H__weibo__7.12.1__android__android4.4.4&wm=5091_0008&aid=01AsfiMEjVzg0YSShsV_ISlRgLOKx7UXK8bxQfU3UzNxYoTHo.&fid=1076031195242865_-_WEIBO_SECOND_PROFILE_WEIBO&uid=6432582011&v_f=2&v_p=55&from=107C195010&gsid=_2A253Pc5MDeRxGeBK6FAU-CzMyj2IHXVSa0aErDV6PUJbkdAKLUXikWpNHetkT4FG1cwd-aJIY8mFs-sLNfa9Yoqb&imsi=310260361179574&lang=zh_CN&lfid=100303type%3D3%26q%3D%E6%9D%A8%E5%B9%82%26t%3D0&page=1&skin=default&count=20&oldwm=5091_0008&sflag=1&containerid=1076031195242865_-_WEIBO_SECOND_PROFILE_WEIBO&ignore_inturrpted_error=true&luicode=10000003&need_head_cards=0")
		    		.header("User-Agent",
							"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.32 (KHTML, like Gecko) Chrome/61.0.3163.79 Safari/537.36")
					.header("Cache-Control", "max-age=60").header("Accept", "*/*")
					.header("Accept-Language", "zh-CN,zh;q=0.8,en;q=0.6").header("Connection", "keep-alive")
					.header("Referer", "http://music.163.com/song?id=2332323")
					.header("Origin", "http://music.163.com").header("Host", "music.163.com")
					.header("Content-Type", "application/x-www-form-urlencoded")
					.method(Method.POST).ignoreContentType(true).timeout(2000000000)
					.execute();
			String body = execute.body();
			System.out.println(body);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}
