package com.mapper;

import com.models.TShippingAddress;
import com.models.TShippingAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TShippingAddressMapper {
    int countByExample(TShippingAddressExample example);

    int deleteByExample(TShippingAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TShippingAddress record);

    int insertSelective(TShippingAddress record);

    List<TShippingAddress> selectByExample(TShippingAddressExample example);

    TShippingAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TShippingAddress record, @Param("example") TShippingAddressExample example);

    int updateByExample(@Param("record") TShippingAddress record, @Param("example") TShippingAddressExample example);

    int updateByPrimaryKeySelective(TShippingAddress record);

    int updateByPrimaryKey(TShippingAddress record);
}