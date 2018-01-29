package org.bianqi.wangyi.process.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 提取表情的正则表达式
 * <p>Title: RegularTest</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月23日下午1:53:48
 * @version 1.0.0
 */
public class RegularTest {

	public static void main(String[] args) {
	        Pattern p = Pattern.compile("(\\[[^\\]]*\\])");  
	        Matcher m = p.matcher("[吐舌][吐舌][吐舌]对于英语没过[跳舞]四级的我，需要中文翻译[吐舌][吐舌]");  
	        while(m.find()){
	        	System.out.println(m.group().substring(1, m.group().length()-1));
	        }  
	}
}
