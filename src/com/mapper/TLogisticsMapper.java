package com.mapper;

import com.models.TLogistics;
import com.models.TLogisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLogisticsMapper {
    int countByExample(TLogisticsExample example);

    int deleteByExample(TLogisticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLogistics record);

    int insertSelective(TLogistics record);

    List<TLogistics> selectByExample(TLogisticsExample example);

    TLogistics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLogistics record, @Param("example") TLogisticsExample example);

    int updateByExample(@Param("record") TLogistics record, @Param("example") TLogisticsExample example);

    int updateByPrimaryKeySelective(TLogistics record);

    int updateByPrimaryKey(TLogistics record);
}