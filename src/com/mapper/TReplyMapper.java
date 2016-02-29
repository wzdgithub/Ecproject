package com.mapper;

import com.models.TReply;
import com.models.TReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TReplyMapper {
    int countByExample(TReplyExample example);

    int deleteByExample(TReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TReply record);

    int insertSelective(TReply record);

    List<TReply> selectByExample(TReplyExample example);

    TReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TReply record, @Param("example") TReplyExample example);

    int updateByExample(@Param("record") TReply record, @Param("example") TReplyExample example);

    int updateByPrimaryKeySelective(TReply record);

    int updateByPrimaryKey(TReply record);
}