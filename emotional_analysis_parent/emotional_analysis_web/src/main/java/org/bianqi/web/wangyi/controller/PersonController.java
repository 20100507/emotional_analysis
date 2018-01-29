package org.bianqi.web.wangyi.controller;

import java.util.List;

import org.bianqi.web.wangyi.service.PersonService;
import org.bianqi.web.wangyi.vo.UserGenderVo;
import org.bianqi.web.wangyi.vo.UserLocationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户的相关数据可视化【地理位置，性别，星座，年龄分布】
 * <p>Title: PersonController</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年3月3日下午8:46:59
 * @version 1.0.0
 */
@RequestMapping("/person")
@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/map")
	public String map(){
		return "person_map";
	}
		
	@RequestMapping("/gender")
	public String gender(){
		return "person_gender";
	}
	
	@RequestMapping("/age")
	public String age(){
		return "person_age";
	}
	
	@RequestMapping("/constel")
	public String constel(){
		return "person_constel";
	}
	
	@RequestMapping("/usergender")
	@ResponseBody
	public List<UserGenderVo> getUserGender(){
		List<UserGenderVo> userGenderVoList = personService.getUserGenderVoList();
		return userGenderVoList;
	}
	
	@RequestMapping("/usermap")
	@ResponseBody
	public List<UserLocationVo> getUserLocation(){
		List<UserLocationVo> userLocationVoList = personService.getUserLocationVoList();
		return userLocationVoList;
	}
	
	@RequestMapping("/userage")
	@ResponseBody
	public List<Integer> getUserAge(){
		List<Integer> userAgeList = personService.getUserAgeList();
		return userAgeList;
	}
	
	@RequestMapping("/userconstel")
	@ResponseBody
	public List<Integer> getUserConstel(){
		return null;
	}
	
}
