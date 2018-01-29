package org.bianqi.web.wangyi.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bianqi.web.wangyi.pojo.UserConstellation;
import org.bianqi.web.wangyi.pojo.UserConstellationExample;

public interface UserConstellationMapper {
    int countByExample(UserConstellationExample example);

    int deleteByExample(UserConstellationExample example);

    int deleteByPrimaryKey(Integer constellationId);

    int insert(UserConstellation record);

    int insertSelective(UserConstellation record);

    List<UserConstellation> selectByExample(UserConstellationExample example);

    UserConstellation selectByPrimaryKey(Integer constellationId);

    int updateByExampleSelective(@Param("record") UserConstellation record, @Param("example") UserConstellationExample example);

    int updateByExample(@Param("record") UserConstellation record, @Param("example") UserConstellationExample example);

    int updateByPrimaryKeySelective(UserConstellation record);

    int updateByPrimaryKey(UserConstellation record);
}