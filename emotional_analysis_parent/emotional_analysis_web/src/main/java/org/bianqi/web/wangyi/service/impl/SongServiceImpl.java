package org.bianqi.web.wangyi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.bianqi.web.wangyi.mapper.SongTopMapper;
import org.bianqi.web.wangyi.pojo.SongTop;
import org.bianqi.web.wangyi.pojo.SongTopExample;
import org.bianqi.web.wangyi.service.SongService;
import org.bianqi.web.wangyi.utils.SearchUtils;
import org.bianqi.web.wangyi.vo.SongTopVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 歌曲的Top榜根据评论的数量
 * <p>Title: SongServiceImpl</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年3月21日下午10:44:07
 * @version 1.0.0
 */
@Service
public class SongServiceImpl implements SongService{
	
	@Autowired
	private SongTopMapper songTopMapper;
	
	@Override
	public List<SongTopVo> getSongTopList() throws Exception {
		List<SongTopVo> songTopVoList = new ArrayList<>();
		SongTopExample example = new SongTopExample();
		example.setOrderByClause("comment_count desc");
        List<SongTop> selectByExample = songTopMapper.selectByExample(example);
        for (SongTop songTop : selectByExample) {
        	SongTopVo songTopVo = new SongTopVo();
        	Integer songid = songTop.getSongid();
        	String singerName = SearchUtils.getSingerById(songid);
        	String songName = SearchUtils.getSongNameById(songid);
        	songTopVo.setSongTop(songTop.getSongtopId());
        	songTopVo.setSongName(songName);
        	songTopVo.setSingerName(singerName);
        	songTopVo.setSongCount(songTop.getCommentCount());
        	songTopVoList.add(songTopVo);
		}
		return songTopVoList;
	}
}
