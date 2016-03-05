package com.mapper;

import com.models.TTypeRelation;
import com.models.TTypeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTypeRelationMapper {
    int countByExample(TTypeRelationExample example);

    int deleteByExample(TTypeRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTypeRelation record);

    int insertSelective(TTypeRelation record);

    List<TTypeRelation> selectByExample(TTypeRelationExample example);

    TTypeRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTypeRelation record, @Param("example") TTypeRelationExample example);

    int updateByExample(@Param("record") TTypeRelation record, @Param("example") TTypeRelationExample example);

    int updateByPrimaryKeySelective(TTypeRelation record);

    int updateByPrimaryKey(TTypeRelation record);
}