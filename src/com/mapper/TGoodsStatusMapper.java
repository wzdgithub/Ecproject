package com.mapper;

import com.models.TGoodsStatus;
import com.models.TGoodsStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGoodsStatusMapper {
    int countByExample(TGoodsStatusExample example);

    int deleteByExample(TGoodsStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGoodsStatus record);

    int insertSelective(TGoodsStatus record);

    List<TGoodsStatus> selectByExample(TGoodsStatusExample example);

    TGoodsStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGoodsStatus record, @Param("example") TGoodsStatusExample example);

    int updateByExample(@Param("record") TGoodsStatus record, @Param("example") TGoodsStatusExample example);

    int updateByPrimaryKeySelective(TGoodsStatus record);

    int updateByPrimaryKey(TGoodsStatus record);
}