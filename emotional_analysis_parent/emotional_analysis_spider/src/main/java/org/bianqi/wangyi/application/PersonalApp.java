package org.bianqi.wangyi.application;

import org.bianqi.wangyi.executor.ThreadExecutor;
import org.bianqi.wangyi.hook.JVMHook;
import org.bianqi.wangyi.proxy.IpProxy;

/**
 * 总的程序入口
 * <p>Title: PersonalApp</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月5日下午2:31:30
 * @version 1.0.0
 */
public class PersonalApp {
	
	public static void main(String[] args)  {	
		//4100004 
		ThreadExecutor executor = new ThreadExecutor(97137413, 97145413, 100, "1");
		executor.scheduerThread();
		IpProxy.newScheduledThreadPool.shutdown();
		executor.shutdownThreadPool();
	}
}
