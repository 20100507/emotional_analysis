package org.bianqi.wangyi.utils;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <p>Title: JsonParseUtil</p>
 * <p>Description: 解析对象数据</p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月2日下午12:09:39
 * @version 1.0.0
 */
public class JsonParseUtil<T> {
	
	ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
	
	public T getJsonData(String data,Class<T> t) throws Exception{
		T readValue = objectMapper.readValue(data.getBytes(), t);
		return readValue;
	}
}
