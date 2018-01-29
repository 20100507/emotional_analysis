package org.bianqi.wangyi.application;

import org.bianqi.wangyi.executor.ThreadExecutor;
import org.bianqi.wangyi.hook.JVMHook;
import org.bianqi.wangyi.proxy.IpProxy;

/**
 * 歌曲抓取
 * <p>Title: SongsApp</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月17日下午10:41:54
 * @version 1.0.0
 */
public class SongsApp {

	public static void main(String[] args)  {
		try {
			ThreadExecutor executor = new ThreadExecutor(60000, 70000L, 5000, "2");
			executor.scheduerThread();
			executor.shutdownThreadPool();
			IpProxy.newScheduledThreadPool.shutdown();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
