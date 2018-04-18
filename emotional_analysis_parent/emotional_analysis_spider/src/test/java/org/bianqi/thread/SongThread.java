package org.bianqi.thread;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Queue;

import org.bianqi.entity.SongEntity;
import org.bianqi.queue.SongQueue;
import org.bianqi.utils.DataSourceUtils;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

/**
 * 
 * <p>Title: SongThread</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年10月25日下午1:42:14
 * @version 1.0.0
 */
public class SongThread implements Runnable {

	private long singStartId;
	private long singEndId;
    public Queue<String> instance;
	public SongThread(long singStartId, long singEndId,Queue<String> instance) throws Exception {
		this.singStartId = singStartId;
		this.instance = instance;
		this.singEndId = singEndId;
	}

	@Override
	public void run() {
		try {
			for (; singStartId <= singEndId; singStartId++) {
				if (singStartId % 2 == 0) {
					Response execute = Jsoup.connect("http://music.163.com/m/song?id=" + singStartId)
							.header("User-Agent",
									"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.79 Safari/537.36")
							.header("Cache-Control", "no-cache").timeout(2000000000).execute();
					String body = execute.body();
					if (body.contains("很抱歉，你要查找的网页找不到")) {
						System.out.println("当前线程为:" + Thread.currentThread().getName() + "爬取到歌曲ID：" + singStartId
								+ "=============很抱歉，你要查找的网页找不到");
						continue;
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
					String url = "http://music.163.com/m/song?id="+singStartId;
					System.out.println("当前线程为:" + Thread.currentThread().getName() + "采集歌曲ID为：" + singStartId
							+ "=============歌曲名称为：" + name);
					SongQueue.addMusicList(Long.toString(singStartId));
					//歌曲持久化
					Connection currentConnection = DataSourceUtils.getCurrentConnection();
					
					String sql = "insert into song (name,singer,album,url) values(?,?,?,?)";
					PreparedStatement pstmt = currentConnection.prepareStatement(sql);
			        pstmt.setString(1, name);
			        pstmt.setString(2, singer);
			        pstmt.setString(3, album);
			        pstmt.setString(4, url);
			        pstmt.executeUpdate();
				} else {
					Response execute = Jsoup.connect("http://music.163.com/m/song?id=" + singStartId)
							.header("User-Agent", "Mozilla/5.0 (Windows NT 6.3; W…) Gecko/20100101 Firefox/56.0")
							.header("Cache-Control", "no-cache").timeout(2000000000).execute();
					String body = execute.body();
					if (body.contains("很抱歉，你要查找的网页找不到")) {
						System.out.println("当前线程为:" + Thread.currentThread().getName() + "爬取到歌曲ID：" + singStartId
								+ "=============很抱歉，你要查找的网页找不到");
						continue;
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
					String url = "http://music.163.com/m/song?id="+singStartId;
					SongQueue.addMusicList(Long.toString(singStartId));
					System.out.println("当前线程为:" + Thread.currentThread().getName() + "采集歌曲ID为：" + singStartId
							+ "=============歌曲名称为：" + name);
					Connection currentConnection = DataSourceUtils.getCurrentConnection();
					String sql = "insert into song (name,singer,album,url) values(?,?,?,?)";
					PreparedStatement pstmt = currentConnection.prepareStatement(sql);
			        pstmt.setString(1, name);
			        pstmt.setString(2, singer);
			        pstmt.setString(3, album);
			        pstmt.setString(4, url);
			        pstmt.executeUpdate();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
