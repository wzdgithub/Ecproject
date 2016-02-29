package com.service.impl;

import com.mapper.TGoodsStatusMapper;
import com.service.GoodsStatusService;

public class GoodsStatusServiceImpl implements GoodsStatusService{
    private TGoodsStatusMapper goodsStatusMapper;

    public TGoodsStatusMapper getGoodsStatusMapper() {
        return goodsStatusMapper;
    }

    public void setGoodsStatusMapper(TGoodsStatusMapper goodsStatusMapper) {
        this.goodsStatusMapper = goodsStatusMapper;
    }
}
