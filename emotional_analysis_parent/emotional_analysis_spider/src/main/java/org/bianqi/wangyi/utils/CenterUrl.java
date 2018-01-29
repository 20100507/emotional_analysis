package org.bianqi.wangyi.utils;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;

import org.jsoup.Jsoup;
import org.bianqi.wangyi.entity.ip.IpEntity;
import org.bianqi.wangyi.proxy.IpProxy;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;

/**
 * 核心的总URL入口
 * <p>Title: CenterUrl</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月2日上午11:58:43
 * @version 1.0.0
 */
public class CenterUrl {
	
	public static String ip;
	public static int port;
	//标记不同浏览器访问
	private static boolean startFlag = true;
	
	//从第三方网站上取得首次代理IP
	static{
		try {
			if(startFlag){
				List<IpEntity> proxyIp = IpProxy.getProxyIp("http://www.xicidaili.com/nn/1");
				IpEntity ipEntity = proxyIp.get(0);
				ip = ipEntity.getIp();
				port = ipEntity.getPort();
				System.err.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^程序正在初始化^^^^^^^^^^^^^^^^^^^^^^^^^");
				startFlag = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getDataByUrl(String url, String encrypt) {
		try{
		//随机抓取新的IP下标
		int j = (int)(Math.random()*14+1);
		System.out.println("****************************正在使用的代理IP:"+ip+"*********端口"+port+"**********************");
		String data = "";
		String secKey = new BigInteger(100, new SecureRandom()).toString(32).substring(0, 16);//limit
		String encText = EncryptUtils.aesEncrypt(EncryptUtils.aesEncrypt(encrypt,"0CoJUm6Qyw8W8jud"), secKey);
        String encSecKey = EncryptUtils.rsaEncrypt(secKey);
	    Response execute = Jsoup.connect(url+"?csrf_token=3a1bfd308516c5275314147c3659649f")
	    		.header("User-Agent",
						"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.32 (KHTML, like Gecko) Chrome/61.0.3163.79 Safari/537.36")
				.header("Cache-Control", "max-age=60").header("Accept", "*/*")
				.header("Accept-Language", "zh-CN,zh;q=0.8,en;q=0.6").header("Connection", "keep-alive")
				.header("Referer", "http://music.163.com/song?id=2999999999")
				.header("Origin", "http://music.163.com").header("Host", "music.163.com")
				.header("Content-Type", "application/x-www-form-urlencoded")
						.data("params",encText)
				.data("encSecKey",encSecKey)
				.method(Method.POST).ignoreContentType(true).timeout(2147483647)
				.proxy(IpProxy.ipEntitys.get(j).getIp(), IpProxy.ipEntitys.get(j).getPort())
				.execute();
				data = execute.body().toString();
				//如果当前的IP被拉黑了就从IP网站上抓取新的IP
				if(data.contains("Cheating")||data.contains("指定 product id") || data.contains("无效用户")){
					int i = (int)(Math.random()*14+1);
					IpEntity ipEntity = IpProxy.ipEntitys.get(i);
					ip = ipEntity.getIp();
					port = ipEntity.getPort();
					return "用户的数据无效！！！";
				}
				return data;
			} catch (Exception e) {
				int i = (int)(Math.random()*14+1);
				IpEntity ipEntity = IpProxy.ipEntitys.get(i);
				ip = ipEntity.getIp();
				port = ipEntity.getPort();
				return "网络超时";
			}
		}
}
