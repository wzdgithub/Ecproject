package com.mapper;

import com.models.TLogisticsRelation;
import com.models.TLogisticsRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLogisticsRelationMapper {
    int countByExample(TLogisticsRelationExample example);

    int deleteByExample(TLogisticsRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLogisticsRelation record);

    int insertSelective(TLogisticsRelation record);

    List<TLogisticsRelation> selectByExample(TLogisticsRelationExample example);

    TLogisticsRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLogisticsRelation record, @Param("example") TLogisticsRelationExample example);

    int updateByExample(@Param("record") TLogisticsRelation record, @Param("example") TLogisticsRelationExample example);

    int updateByPrimaryKeySelective(TLogisticsRelation record);

    int updateByPrimaryKey(TLogisticsRelation record);
}