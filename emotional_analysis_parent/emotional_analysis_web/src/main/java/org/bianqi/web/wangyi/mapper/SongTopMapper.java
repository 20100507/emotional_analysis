package org.bianqi.web.wangyi.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bianqi.web.wangyi.pojo.SongTop;
import org.bianqi.web.wangyi.pojo.SongTopExample;

public interface SongTopMapper {
    int countByExample(SongTopExample example);

    int deleteByExample(SongTopExample example);

    int deleteByPrimaryKey(Integer songtopId);

    int insert(SongTop record);

    int insertSelective(SongTop record);

    List<SongTop> selectByExample(SongTopExample example);

    SongTop selectByPrimaryKey(Integer songtopId);

    int updateByExampleSelective(@Param("record") SongTop record, @Param("example") SongTopExample example);

    int updateByExample(@Param("record") SongTop record, @Param("example") SongTopExample example);

    int updateByPrimaryKeySelective(SongTop record);

    int updateByPrimaryKey(SongTop record);
}