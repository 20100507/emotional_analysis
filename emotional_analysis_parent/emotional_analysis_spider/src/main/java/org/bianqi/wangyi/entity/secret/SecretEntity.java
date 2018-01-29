package org.bianqi.wangyi.entity.secret;

/**
 * 
 * <p>Title: SecretEntity</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年10月25日下午2:22:50
 * @version 1.0.0
 */
public class SecretEntity {
	
	private String params;
	private String encSecKey;
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getEncSecKey() {
		return encSecKey;
	}
	public void setEncSecKey(String encSecKey) {
		this.encSecKey = encSecKey;
	}
	public SecretEntity() {
		super();
	}
	@Override
	public String toString() {
		return "SecretEntity [params=" + params + ", encSecKey=" + encSecKey + "]";
	}
}
