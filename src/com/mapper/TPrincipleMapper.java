package com.mapper;

import com.models.TPrinciple;
import com.models.TPrincipleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPrincipleMapper {
    int countByExample(TPrincipleExample example);

    int deleteByExample(TPrincipleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPrinciple record);

    int insertSelective(TPrinciple record);

    List<TPrinciple> selectByExample(TPrincipleExample example);

    TPrinciple selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPrinciple record, @Param("example") TPrincipleExample example);

    int updateByExample(@Param("record") TPrinciple record, @Param("example") TPrincipleExample example);

    int updateByPrimaryKeySelective(TPrinciple record);

    int updateByPrimaryKey(TPrinciple record);
}