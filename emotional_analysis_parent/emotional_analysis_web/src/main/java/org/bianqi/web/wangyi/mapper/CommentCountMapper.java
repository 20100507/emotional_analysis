package org.bianqi.web.wangyi.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bianqi.web.wangyi.pojo.CommentCount;
import org.bianqi.web.wangyi.pojo.CommentCountExample;

public interface CommentCountMapper {
    int countByExample(CommentCountExample example);

    int deleteByExample(CommentCountExample example);

    int deleteByPrimaryKey(Integer wordcountId);

    int insert(CommentCount record);

    int insertSelective(CommentCount record);

    List<CommentCount> selectByExample(CommentCountExample example);

    CommentCount selectByPrimaryKey(Integer wordcountId);

    int updateByExampleSelective(@Param("record") CommentCount record, @Param("example") CommentCountExample example);

    int updateByExample(@Param("record") CommentCount record, @Param("example") CommentCountExample example);

    int updateByPrimaryKeySelective(CommentCount record);

    int updateByPrimaryKey(CommentCount record);
}