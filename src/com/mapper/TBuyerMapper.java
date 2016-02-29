package com.mapper;

import com.models.TBuyer;
import com.models.TBuyerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBuyerMapper {
    int countByExample(TBuyerExample example);

    int deleteByExample(TBuyerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBuyer record);

    int insertSelective(TBuyer record);

    List<TBuyer> selectByExample(TBuyerExample example);

    TBuyer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBuyer record, @Param("example") TBuyerExample example);

    int updateByExample(@Param("record") TBuyer record, @Param("example") TBuyerExample example);

    int updateByPrimaryKeySelective(TBuyer record);

    int updateByPrimaryKey(TBuyer record);
}