package org.bianqi.wangyi.executor;


import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.bianqi.wangyi.proxy.IpProxy;
import org.bianqi.wangyi.spider.comments.CommentThread;
import org.bianqi.wangyi.spider.comments.HotCommentsThread;
import org.bianqi.wangyi.spider.followed.FollowedThread;
import org.bianqi.wangyi.spider.followers.FollowersThread;
import org.bianqi.wangyi.spider.personal.PersonalCenterThread;
import org.bianqi.wangyi.spider.song.SongThread;
import org.bianqi.wangyi.task.ThreadTask;
/**
 *线程调度中心
 * <p>Title: CenterExecutor</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月5日下午2:25:24
 * @version 1.0.0
 */
public class ThreadExecutor {

	private ThreadPool threadPool;
	private ThreadTask task;
	private String taskFlag;
	private long startId;
	private long endId;
	public Queue<Long> collectionUrls = new ConcurrentLinkedQueue<>();
	
	/**
	 * 代理IP资源池
	 */
	static{
		IpProxy.timerGetIps();
	}
	
	public ThreadExecutor(long startId,long endId,int threadNum,String taskFlag){
		this.startId = startId;
		this.endId = endId;
		this.taskFlag = taskFlag;
		threadPool = new ThreadPool(threadNum);
		init();
	}
	
	/**
	 * 初始化爬取的队列
	 * <p>Title: init</p>
	 * <p>Description: </p>
	 */
	public void init() {
		if(startId > endId){
			System.err.println("输入不合法！");
			System.exit(0);
		}
		for (; startId < endId; startId++) {
			collectionUrls.add(startId);
		}
		System.err.println("添加工作队列成功！");
	}
	
	
	/**
	 * 调度线程
	 * <p>Title: scheduerThread</p>
	 * <p>Description: </p>
	 */
	public void scheduerThread() {
		while (true) {
			if (threadPool.getThreadAlive().get() < threadPool.getThreadNum()) {
				System.out.println("当前线程池存活线程"+threadPool.getThreadAlive().get()+"线程池线程数量:"+threadPool.getThreadNum()+"当前URL队列数量"+collectionUrls.size());
				if (!collectionUrls.isEmpty()) {
					Long uid = collectionUrls.poll();
					switch(taskFlag){
					case "1":
						task = new PersonalCenterThread(uid);
					break;
					case "2":
						task = new SongThread(uid);
					break;
					case "3":
						System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+uid);
						task = new HotCommentsThread(uid);
					break;
					case "4":
						task = new	CommentThread(uid);
					break;
					case "5":
						task = new FollowedThread(uid);
					break;
					case "6":
						task = new FollowersThread(uid);
					break;
					default: System.exit(-1);;
					}
					threadPool.execute(task);
				} else {
					System.out.println("队列数据消耗完毕~~~~~~~~~~~~~");
					break;
				}
			} else {
				System.out.println("当前线程池存活线程"+threadPool.getThreadAlive().get()+"线程池线程数量:"+threadPool.getThreadNum()+"当前URL队列数量"+collectionUrls.size());
				Long uid = collectionUrls.poll();
				if (uid != null) {
					switch (taskFlag) {
					case "1":
						task = new PersonalCenterThread(uid);
						break;
					case "2":
						task = new SongThread(uid);
						break;
					case "3":
						task = new HotCommentsThread(uid);
						break;
					case "4":
						task = new CommentThread(uid);
						break;
					case "5":
						task = new FollowedThread(uid);
						break;
					case "6":
						task = new FollowersThread(uid);
						break;
					default:
						System.exit(-1);
					}
					threadPool.execute(task);
				}
			}
		}
	}
	
	/**
	 * 关闭线程池
	 * <p>Title: shutdownThreadPool</p>
	 * <p>Description: </p>
	 */
	public void shutdownThreadPool(){
		threadPool.shutdown();
	}
}
