package com.mapper;

import com.models.TGoodstype;
import com.models.TGoodstypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGoodstypeMapper {
    int countByExample(TGoodstypeExample example);

    int deleteByExample(TGoodstypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGoodstype record);

    int insertSelective(TGoodstype record);

    List<TGoodstype> selectByExample(TGoodstypeExample example);

    TGoodstype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGoodstype record, @Param("example") TGoodstypeExample example);

    int updateByExample(@Param("record") TGoodstype record, @Param("example") TGoodstypeExample example);

    int updateByPrimaryKeySelective(TGoodstype record);

    int updateByPrimaryKey(TGoodstype record);
}