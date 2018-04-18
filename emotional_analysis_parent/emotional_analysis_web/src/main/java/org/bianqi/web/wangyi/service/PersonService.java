package org.bianqi.web.wangyi.service;

import java.util.List;

import org.bianqi.web.wangyi.vo.UserGenderVo;
import org.bianqi.web.wangyi.vo.UserLocationVo;

public interface PersonService {
	
	List<UserLocationVo> getUserLocationVoList();

	List<UserGenderVo> getUserGenderVoList();
	
	List<Integer> getUserAgeList();
}
