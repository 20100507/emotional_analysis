package org.bianqi.web.wangyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页测试
 * <p>Title: IndexController</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月18日下午5:26:56
 * @version 1.0.0
 */
@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
}











