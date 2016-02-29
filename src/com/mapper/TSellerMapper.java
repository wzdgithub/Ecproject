package com.mapper;

import com.models.TSeller;
import com.models.TSellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSellerMapper {
    int countByExample(TSellerExample example);

    int deleteByExample(TSellerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSeller record);

    int insertSelective(TSeller record);

    List<TSeller> selectByExample(TSellerExample example);

    TSeller selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSeller record, @Param("example") TSellerExample example);

    int updateByExample(@Param("record") TSeller record, @Param("example") TSellerExample example);

    int updateByPrimaryKeySelective(TSeller record);

    int updateByPrimaryKey(TSeller record);
}