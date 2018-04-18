package org.bianqi.web.wangyi.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bianqi.web.wangyi.pojo.UserAge;
import org.bianqi.web.wangyi.pojo.UserAgeExample;

public interface UserAgeMapper {
    int countByExample(UserAgeExample example);

    int deleteByExample(UserAgeExample example);

    int deleteByPrimaryKey(Integer ageId);

    int insert(UserAge record);

    int insertSelective(UserAge record);

    List<UserAge> selectByExample(UserAgeExample example);

    UserAge selectByPrimaryKey(Integer ageId);

    int updateByExampleSelective(@Param("record") UserAge record, @Param("example") UserAgeExample example);

    int updateByExample(@Param("record") UserAge record, @Param("example") UserAgeExample example);

    int updateByPrimaryKeySelective(UserAge record);

    int updateByPrimaryKey(UserAge record);
}