package org.bianqi.wangyi.application;

import org.bianqi.wangyi.executor.ThreadExecutor;
import org.bianqi.wangyi.proxy.IpProxy;

/**
 * 评论数据抓取
 * <p>Title: CommentApp</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月21日下午7:18:29
 * @version 1.0.0
 */
public class CommentApp {
	
	public static void main(String[] args)  {
		try{
//			int endId = Integer.parseInt(args[0]);
//			int threadNum = Integer.parseInt(args[1]);
//			if(endId > 200000){
//				throw new RuntimeException();
//			}
//			if(threadNum > 16000){
//				throw new RuntimeException();
//			}
//			long startId = PropertyUtil.readProp("point.properties", "comment_point");

			ThreadExecutor executor = new ThreadExecutor(70000, 90000, 5000, "4");
//			ThreadExecutor executor = new ThreadExecutor(startId, endId + startId, threadNum, "4");
//			new JVMHook().writePropAndHook("comment_point",startId+executor.collectionUrls.size()+"");
			executor.scheduerThread();
			executor.shutdownThreadPool();
			IpProxy.newScheduledThreadPool.shutdown();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("第一个参数为抓取的数量数不大于30W,第二个参数为线程数不要大于16000");
		}
	}
}
