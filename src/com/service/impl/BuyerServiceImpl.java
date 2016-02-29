package com.service.impl;

import com.mapper.TBuyerMapper;
import com.service.BuyerService;

public class BuyerServiceImpl implements BuyerService{
    private TBuyerMapper buyerMapper;

    public TBuyerMapper getBuyerMapper() {
        return buyerMapper;
    }

    public void setBuyerMapper(TBuyerMapper buyerMapper) {
        this.buyerMapper = buyerMapper;
    }
}
