package org.bianqi.web.wangyi.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bianqi.web.wangyi.pojo.GraphTriangle;
import org.bianqi.web.wangyi.pojo.GraphTriangleExample;

public interface GraphTriangleMapper {
    int countByExample(GraphTriangleExample example);

    int deleteByExample(GraphTriangleExample example);

    int deleteByPrimaryKey(Integer triangleId);

    int insert(GraphTriangle record);

    int insertSelective(GraphTriangle record);

    List<GraphTriangle> selectByExample(GraphTriangleExample example);

    GraphTriangle selectByPrimaryKey(Integer triangleId);

    int updateByExampleSelective(@Param("record") GraphTriangle record, @Param("example") GraphTriangleExample example);

    int updateByExample(@Param("record") GraphTriangle record, @Param("example") GraphTriangleExample example);

    int updateByPrimaryKeySelective(GraphTriangle record);

    int updateByPrimaryKey(GraphTriangle record);
}