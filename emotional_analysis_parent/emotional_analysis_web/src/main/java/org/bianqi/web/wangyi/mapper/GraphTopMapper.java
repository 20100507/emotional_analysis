package org.bianqi.web.wangyi.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bianqi.web.wangyi.pojo.GraphTop;
import org.bianqi.web.wangyi.pojo.GraphTopExample;

public interface GraphTopMapper {
    int countByExample(GraphTopExample example);

    int deleteByExample(GraphTopExample example);

    int deleteByPrimaryKey(Integer graphtopIp);

    int insert(GraphTop record);

    int insertSelective(GraphTop record);

    List<GraphTop> selectByExample(GraphTopExample example);

    GraphTop selectByPrimaryKey(Integer graphtopIp);

    int updateByExampleSelective(@Param("record") GraphTop record, @Param("example") GraphTopExample example);

    int updateByExample(@Param("record") GraphTop record, @Param("example") GraphTopExample example);

    int updateByPrimaryKeySelective(GraphTop record);

    int updateByPrimaryKey(GraphTop record);
}