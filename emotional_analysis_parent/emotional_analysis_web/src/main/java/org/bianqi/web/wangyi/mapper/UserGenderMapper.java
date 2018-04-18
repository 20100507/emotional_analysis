package org.bianqi.web.wangyi.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bianqi.web.wangyi.pojo.UserGender;
import org.bianqi.web.wangyi.pojo.UserGenderExample;

public interface UserGenderMapper {
    int countByExample(UserGenderExample example);

    int deleteByExample(UserGenderExample example);

    int deleteByPrimaryKey(Integer genderId);

    int insert(UserGender record);

    int insertSelective(UserGender record);

    List<UserGender> selectByExample(UserGenderExample example);

    UserGender selectByPrimaryKey(Integer genderId);

    int updateByExampleSelective(@Param("record") UserGender record, @Param("example") UserGenderExample example);

    int updateByExample(@Param("record") UserGender record, @Param("example") UserGenderExample example);

    int updateByPrimaryKeySelective(UserGender record);

    int updateByPrimaryKey(UserGender record);
}