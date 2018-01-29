package org.bianqi.web.wangyi.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bianqi.web.wangyi.pojo.UserLocation;
import org.bianqi.web.wangyi.pojo.UserLocationExample;

public interface UserLocationMapper {
    int countByExample(UserLocationExample example);

    int deleteByExample(UserLocationExample example);

    int deleteByPrimaryKey(Integer locationId);

    int insert(UserLocation record);

    int insertSelective(UserLocation record);

    List<UserLocation> selectByExample(UserLocationExample example);

    UserLocation selectByPrimaryKey(Integer locationId);

    int updateByExampleSelective(@Param("record") UserLocation record, @Param("example") UserLocationExample example);

    int updateByExample(@Param("record") UserLocation record, @Param("example") UserLocationExample example);

    int updateByPrimaryKeySelective(UserLocation record);

    int updateByPrimaryKey(UserLocation record);
}