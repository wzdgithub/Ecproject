package com.service.impl;

import com.mapper.TGoodstypeMapper;
import com.service.GoodStypeService;

public class GoodStypeServiceImpl implements GoodStypeService{
    private TGoodstypeMapper goodstypeMapper;

    public TGoodstypeMapper getGoodstypeMapper() {
        return goodstypeMapper;
    }

    public void setGoodstypeMapper(TGoodstypeMapper goodstypeMapper) {
        this.goodstypeMapper = goodstypeMapper;
    }
}
