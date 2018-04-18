package org.bianqi.wangyi.application;

import org.bianqi.wangyi.executor.ThreadExecutor;
import org.bianqi.wangyi.proxy.IpProxy;

/**
 * 热门评论
 * <p>Title: HotCommentApp</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月18日下午3:28:20
 * @version 1.0.0
 */
public class HotCommentApp {
	
	public static void main(String[] args)  {
		ThreadExecutor executor = new ThreadExecutor(95000, 100000, 50, "3");
		executor.scheduerThread();
		IpProxy.newScheduledThreadPool.shutdown();
		executor.shutdownThreadPool();
	}
	
}
