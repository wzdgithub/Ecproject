package com.mapper;

import com.models.TUsedGoods;
import com.models.TUsedGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUsedGoodsMapper {
    int countByExample(TUsedGoodsExample example);

    int deleteByExample(TUsedGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUsedGoods record);

    int insertSelective(TUsedGoods record);

    List<TUsedGoods> selectByExample(TUsedGoodsExample example);

    TUsedGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUsedGoods record, @Param("example") TUsedGoodsExample example);

    int updateByExample(@Param("record") TUsedGoods record, @Param("example") TUsedGoodsExample example);

    int updateByPrimaryKeySelective(TUsedGoods record);

    int updateByPrimaryKey(TUsedGoods record);
}