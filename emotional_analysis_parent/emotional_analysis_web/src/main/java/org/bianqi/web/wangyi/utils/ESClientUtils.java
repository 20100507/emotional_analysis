package org.bianqi.web.wangyi.utils;

import java.net.InetSocketAddress;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

/**
 * ES连接
 * <p>Title: ESClientUtils</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月23日下午7:23:31
 * @version 1.0.0
 */
public class ESClientUtils {

	private static TransportClient client;

	public static TransportClient getClient() {
		Settings settings = Settings.settingsBuilder().put("client.transport.ignore_cluster_name", true)
				.build();
		client = TransportClient.builder().settings(settings).build()
				.addTransportAddress(new InetSocketTransportAddress(new InetSocketAddress("192.168.254.129", 9300)));
		return client;
	}
}
