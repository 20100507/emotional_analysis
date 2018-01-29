package org.bianqi.wangyi.proxy;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.bianqi.wangyi.entity.ip.IpEntity;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;

/**
 * 代理IP获取的渠道
 * <p>Title: CenterUrl</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月2日上午11:58:43
 * @version 1.0.0
 */
public class IpProxy {
	
	public static List<IpEntity> ipEntitys = new ArrayList<>();
	public static ScheduledExecutorService newScheduledThreadPool;
	
	
	
	public static List<IpEntity> getProxyIp(String url) throws Exception{
		ArrayList<IpEntity> ipList = new ArrayList<>();
		Response execute = Jsoup.connect(url)
				.header("User-Agent",
						"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.79 Safari/537.36")
				.header("Cache-Control", "max-age=60").header("Accept", "*/*")
				.header("Accept-Language", "zh-CN,zh;q=0.8,en;q=0.6").header("Connection", "keep-alive")
				.header("Referer", "http://music.163.com/song?id=186016")
				.header("Origin", "http://music.163.com").header("Host", "music.163.com")
				.header("Content-Type", "application/x-www-form-urlencoded")
				.header("Cookie",
						"UM_distinctid=15e9863cf14335-0a09f939cd2af9-6d1b137c-100200-15e9863cf157f1; vjuids=414b87eb3.15e9863cfc1.0.ec99d6f660d09; _ntes_nnid=4543481cc76ab2fd3110ecaafd5f1288,1505795231854; _ntes_nuid=4543481cc76ab2fd3110ecaafd5f1288; __s_=1; __gads=ID=6cbc4ab41878c6b9:T=1505795247:S=ALNI_MbCe-bAY4kZyMbVKlS4T2BSuY75kw; usertrack=c+xxC1nMphjBCzKpBPJjAg==; NTES_CMT_USER_INFO=100899097%7Cm187****4250%7C%7Cfalse%7CbTE4NzAzNDE0MjUwQDE2My5jb20%3D; P_INFO=m18703414250@163.com|1507178162|2|mail163|00&99|CA&1506163335&mail163#hun&430800#10#0#0|187250&1|163|18703414250@163.com; vinfo_n_f_l_n3=8ba0369be425c0d2.1.7.1505795231863.1507950353704.1508150387844; vjlast=1505795232.1508150167.11; Province=0450; City=0454; _ga=GA1.2.1044198758.1506584097; _gid=GA1.2.763458995.1508907342; JSESSIONID-WYYY=Zm%2FnBG6%2B1vb%2BfJp%5CJP8nIyBZQfABmnAiIqMM8fgXABoqI0PdVq%2FpCsSPDROY1APPaZnFgh14pR2pV9E0Vdv2DaO%2BKkifMncYvxRVlOKMEGzq9dTcC%2F0PI07KWacWqGpwO88GviAmX%2BVuDkIVNBEquDrJ4QKhTZ2dzyGD%2Bd2T%2BbiztinJ%3A1508946396692; _iuqxldmzr_=32; playerid=20572717; MUSIC_U=39d0b2b5e15675f10fd5d9c05e8a5d593c61fcb81368d4431bab029c28eff977d4a57de2f409f533b482feaf99a1b61e80836282123441c67df96e4bf32a71bc38be3a5b629323e7bf122d59fa1ed6a2; __remember_me=true; __csrf=2032a8f34f1f92412a49ba3d6f68b2db; __utma=94650624.1044198758.1506584097.1508939111.1508942690.40; __utmb=94650624.20.10.1508942690; __utmc=94650624; __utmz=94650624.1508394258.18.4.utmcsr=xujin.org|utmccn=(referral)|utmcmd=referral|utmcct=/")
				.method(Method.GET).ignoreContentType(true)
				.timeout(2099999999).execute();
		Document pageJson = execute.parse();
		Element body = pageJson.body();
		List<Node> childNodes = body.childNode(11).childNode(3).childNode(5).childNode(1).childNodes();
		//把前10位的代理IP放到List中
		for(int i = 2;i <= 30;i += 2){
			IpEntity ipEntity = new IpEntity();
			Node node = childNodes.get(i);
			List<Node> nodes = node.childNodes();
			String ip = nodes.get(3).childNode(0).toString();
			int port = Integer.parseInt(nodes.get(5).childNode(0).toString());
			ipEntity.setIp(ip);
			ipEntity.setPort(port);
			ipList.add(ipEntity);
		}
		return ipList;
	}
	
	public static List<IpEntity> getProxyIps(String url1,String url2,String url3) throws Exception{
		List<IpEntity> proxyList1 = getProxyIp(url1);
		ipEntitys.addAll(proxyList1);
		return ipEntitys;
	}
	
	public static void timerGetIps(){
		newScheduledThreadPool = Executors.newSingleThreadScheduledExecutor();
		newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				try {
					System.err.println("@@@@@@@@@@@@@@@@======================调用IP网站=====================@@@@@@@@@@@@@@@@");
					getProxyIps("http://www.xicidaili.com/nn/1","http://www.xicidaili.com/nt/1","http://www.xicidaili.com/nn/1");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, 0, 60, TimeUnit.SECONDS);
	}
}
