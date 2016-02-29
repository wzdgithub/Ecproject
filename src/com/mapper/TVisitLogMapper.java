package com.mapper;

import com.models.TVisitLog;
import com.models.TVisitLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVisitLogMapper {
    int countByExample(TVisitLogExample example);

    int deleteByExample(TVisitLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TVisitLog record);

    int insertSelective(TVisitLog record);

    List<TVisitLog> selectByExample(TVisitLogExample example);

    TVisitLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TVisitLog record, @Param("example") TVisitLogExample example);

    int updateByExample(@Param("record") TVisitLog record, @Param("example") TVisitLogExample example);

    int updateByPrimaryKeySelective(TVisitLog record);

    int updateByPrimaryKey(TVisitLog record);
}