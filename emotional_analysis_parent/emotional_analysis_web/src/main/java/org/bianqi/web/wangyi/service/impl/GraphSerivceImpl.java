package org.bianqi.web.wangyi.service.impl;

import java.util.List;

import org.bianqi.web.wangyi.mapper.GraphTopMapper;
import org.bianqi.web.wangyi.mapper.GraphTriangleMapper;
import org.bianqi.web.wangyi.pojo.GraphTop;
import org.bianqi.web.wangyi.pojo.GraphTopExample;
import org.bianqi.web.wangyi.pojo.GraphTopExample.Criteria;
import org.bianqi.web.wangyi.pojo.GraphTriangle;
import org.bianqi.web.wangyi.pojo.GraphTriangleExample;
import org.bianqi.web.wangyi.service.GraphSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 图计算的Service
 * <p>Title: GraphSerivceImpl</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年3月3日下午2:48:30
 * @version 1.0.0
 */
@Service
public class GraphSerivceImpl implements GraphSerivce{
	
	@Autowired
	private GraphTopMapper graphTopMapper;
	
	@Autowired
	private GraphTriangleMapper graphTriangleMapper;
	
	@Override
	public List<GraphTop> getGraphTopList() {
		GraphTopExample example = new GraphTopExample();
		example.setOrderByClause("top desc");
		List<GraphTop> selectByExample = graphTopMapper.selectByExample(example);
		return selectByExample;
	}

	@Override
	public List<GraphTriangle> getGraphTriangle() {
		GraphTriangleExample example = new GraphTriangleExample();
		example.setOrderByClause("triangle_top desc");
		List<GraphTriangle> selectByExample = graphTriangleMapper.selectByExample(example);
		return selectByExample;
	}

}
