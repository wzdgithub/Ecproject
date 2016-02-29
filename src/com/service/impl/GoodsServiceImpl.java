package com.service.impl;

import com.mapper.TGoodsMapper;
import com.service.GoodsService;

public class GoodsServiceImpl implements GoodsService{
    private TGoodsMapper goodsMapper;

    public TGoodsMapper getGoodsMapper() {
        return goodsMapper;
    }

    public void setGoodsMapper(TGoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }
}
