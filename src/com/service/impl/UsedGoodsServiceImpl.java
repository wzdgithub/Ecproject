package com.service.impl;

import com.mapper.TUsedGoodsMapper;
import com.service.UsedGoodsService;

public class UsedGoodsServiceImpl implements UsedGoodsService{
    private TUsedGoodsMapper usedGoodsMapper;

    public TUsedGoodsMapper getUsedGoodsMapper() {
        return usedGoodsMapper;
    }

    public void setUsedGoodsMapper(TUsedGoodsMapper usedGoodsMapper) {
        this.usedGoodsMapper = usedGoodsMapper;
    }
}
