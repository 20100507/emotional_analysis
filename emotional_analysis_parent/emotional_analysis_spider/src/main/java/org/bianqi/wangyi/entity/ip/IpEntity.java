package org.bianqi.wangyi.entity.ip;

/**
 * IP的封装
 * <p>Title: IpEntity</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月11日下午5:36:49
 * @version 1.0.0
 */
public class IpEntity {
	
	private String ip;
	private int port;
	private String speed;
	private boolean available;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
