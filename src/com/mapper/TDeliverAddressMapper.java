package com.mapper;

import com.models.TDeliverAddress;
import com.models.TDeliverAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDeliverAddressMapper {
    int countByExample(TDeliverAddressExample example);

    int deleteByExample(TDeliverAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDeliverAddress record);

    int insertSelective(TDeliverAddress record);

    List<TDeliverAddress> selectByExample(TDeliverAddressExample example);

    TDeliverAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDeliverAddress record, @Param("example") TDeliverAddressExample example);

    int updateByExample(@Param("record") TDeliverAddress record, @Param("example") TDeliverAddressExample example);

    int updateByPrimaryKeySelective(TDeliverAddress record);

    int updateByPrimaryKey(TDeliverAddress record);
}