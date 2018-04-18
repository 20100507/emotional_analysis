package org.bianqi.wangyi.spider.song;



import java.util.Random;

import org.bianqi.wangyi.proxy.IpProxy;
import org.bianqi.wangyi.task.ThreadTask;
import org.bianqi.wangyi.utils.FileSourceUtils;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class SongThread extends ThreadTask{

	

	public SongThread(long uid) {
		super(uid);
	}

	@Override
	public void run() {
		try {
				if (uid % 2 == 0) {
					int i = new Random().nextInt(14);
					Response execute = Jsoup.connect("http://music.163.com/m/song?id=" + uid)
							.header("User-Agent",
									"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.79 Safari/537.36")
							.header("Cache-Control", "no-cache").timeout(2000000000)
//							.proxy(IpProxy.ipEntitys.get(i).getIp(),IpProxy.ipEntitys.get(i).getPort())
							.execute();
					String body = execute.body();
					if (body.contains("很抱歉，你要查找的网页找不到")) {
						System.out.println("当前线程为:" + Thread.currentThread().getName() + "爬取到歌曲ID：" + uid
								+ "=============很抱歉，你要查找的网页找不到");
					}
					Document parse = execute.parse();
					Elements elementsByClass = parse.getElementsByClass("f-ff2");
					Element element = elementsByClass.get(0);
					Node childNode = element.childNode(0);
					// 获取歌曲
					String name = childNode.toString();
					Elements elements = parse.getElementsByClass("s-fc7");
					Element singerElement = elements.get(1);
					Node singerChildNode = singerElement.childNode(0);
					// 获取该歌曲的歌手
					String singer = singerChildNode.toString();
					// 获取专辑
					Element albumElement = elements.get(2);
					Node albumChildNode = albumElement.childNode(0);
					String album = albumChildNode.toString();
					String url = "http://music.163.com/m/song?id="+uid;
					System.out.println("当前线程为:" + Thread.currentThread().getName() + "采集歌曲ID为：" + uid
							+ "=============歌曲名称为：" + name);
					//歌曲持久化
					new FileSourceUtils().importData(name+"\t"+singer+"\t"+album+"\t"+url, "song");
				} else {
					Response execute = Jsoup.connect("http://music.163.com/m/song?id=" + uid)
							.header("User-Agent", "Mozilla/5.0 (Windows NT 6.3; W…) Gecko/20100101 Firefox/56.0")
							.header("Cache-Control", "no-cache").timeout(2000000000).execute();
					String body = execute.body();
					if (body.contains("很抱歉，你要查找的网页找不到")) {
						System.out.println("当前线程为:" + Thread.currentThread().getName() + "爬取到歌曲ID：" + uid
								+ "=============很抱歉，你要查找的网页找不到");
					}
					Document parse = execute.parse();
					Elements elementsByClass = parse.getElementsByClass("f-ff2");
					Element element = elementsByClass.get(0);
					Node childNode = element.childNode(0);
					String name = childNode.toString();
					Elements elements = parse.getElementsByClass("s-fc7");
					Element singerElement = elements.get(1);
					Node singerChildNode = singerElement.childNode(0);
					// 获取该歌曲的歌手
					String singer = singerChildNode.toString();
					// 获取专辑
					Element albumElement = elements.get(2);
					Node albumChildNode = albumElement.childNode(0);
					String album = albumChildNode.toString();
					String url = "http://music.163.com/m/song?id="+uid;
					System.out.println("当前线程为:" + Thread.currentThread().getName() + "采集歌曲ID为：" + uid
							+ "=============歌曲名称为：" + name);
					new FileSourceUtils().importData(name+"\t"+singer+"\t"+album+"\t"+url, "song");
				}
		} catch (Exception e) {
		}
	}

}
