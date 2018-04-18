package org.bianqi.web.wangyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 人物画像
 * <p>Title: PortraitController</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年4月12日下午8:11:00
 * @version 1.0.0
 */
@RequestMapping("/portrait")
@Controller
public class PortraitController {
	
	
	@RequestMapping("/person")
	public String portrait(){
		return "portrait";
	}
}
