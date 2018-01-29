package org.bianqi.web.wangyi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.bianqi.web.wangyi.mapper.UserAgeMapper;
import org.bianqi.web.wangyi.mapper.UserConstellationMapper;
import org.bianqi.web.wangyi.mapper.UserGenderMapper;
import org.bianqi.web.wangyi.mapper.UserLocationMapper;
import org.bianqi.web.wangyi.pojo.UserAge;
import org.bianqi.web.wangyi.pojo.UserAgeExample;
import org.bianqi.web.wangyi.pojo.UserConstellation;
import org.bianqi.web.wangyi.pojo.UserGender;
import org.bianqi.web.wangyi.pojo.UserGenderExample;
import org.bianqi.web.wangyi.pojo.UserLocation;
import org.bianqi.web.wangyi.pojo.UserLocationExample;
import org.bianqi.web.wangyi.service.PersonService;
import org.bianqi.web.wangyi.vo.UserGenderVo;
import org.bianqi.web.wangyi.vo.UserLocationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户的信息web展现平台
 * <p>Title: PersonServiceImpl</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年3月4日下午1:29:45
 * @version 1.0.0
 */
@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private UserLocationMapper userLocationMapper;
	
	@Autowired
	private UserGenderMapper userGenderMapper;
	
	@Autowired
	private UserAgeMapper userAgeMapper;
	
	@Autowired
	private UserConstellationMapper userConstellationMapper;
	
	@Override
	public List<UserLocationVo> getUserLocationVoList() {
		List<UserLocationVo> userLocationList = new ArrayList<>();
		UserLocationExample example = new UserLocationExample();
		List<UserLocation> selectByExample = userLocationMapper.selectByExample(example);
		for (UserLocation userLocation : selectByExample) {
			UserLocationVo locationVo = new UserLocationVo();
			if(userLocation.getLocation().equals("其他")){
				continue;
			}
			locationVo.setName(userLocation.getLocation());
			locationVo.setValue(userLocation.getTotalCount());
			userLocationList.add(locationVo);
		}
		return userLocationList;
	}

	@Override
	public List<UserGenderVo> getUserGenderVoList() {
		List<UserGenderVo> userGenderVos = new ArrayList<>();
		UserGenderExample example = new UserGenderExample();
		List<UserGender> selectByExample = userGenderMapper.selectByExample(example);
		for (UserGender userGender : selectByExample) {
			UserGenderVo genderVo = new UserGenderVo();
			genderVo.setName(userGender.getGender());
			genderVo.setValue(userGender.getGenderCount());
			userGenderVos.add(genderVo);
		}
		return userGenderVos;
	}

	@Override
	public List<Integer> getUserAgeList() {
		UserAgeExample ageExample = new UserAgeExample();
		ageExample.setOrderByClause("year_range asc");
		List<UserAge> selectByExample = userAgeMapper.selectByExample(ageExample);
		List<Integer> ages = new ArrayList<>();
		for (UserAge userAge : selectByExample) {
			if(userAge.getYearRange() == 7777){
				continue;
			}
			ages.add(userAge.getTotalCount());
		}
		return ages;
	}

}
