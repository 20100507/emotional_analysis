package org.bianqi.web.wangyi.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bianqi.web.wangyi.pojo.CommentInterval;
import org.bianqi.web.wangyi.pojo.CommentIntervalExample;

public interface CommentIntervalMapper {
    int countByExample(CommentIntervalExample example);

    int deleteByExample(CommentIntervalExample example);

    int deleteByPrimaryKey(Integer intervalId);

    int insert(CommentInterval record);

    int insertSelective(CommentInterval record);

    List<CommentInterval> selectByExample(CommentIntervalExample example);

    CommentInterval selectByPrimaryKey(Integer intervalId);

    int updateByExampleSelective(@Param("record") CommentInterval record, @Param("example") CommentIntervalExample example);

    int updateByExample(@Param("record") CommentInterval record, @Param("example") CommentIntervalExample example);

    int updateByPrimaryKeySelective(CommentInterval record);

    int updateByPrimaryKey(CommentInterval record);
}