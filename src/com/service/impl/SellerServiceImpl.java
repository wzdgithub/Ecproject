package com.service.impl;

import com.mapper.TSellerMapper;
import com.service.SellerService;

public class SellerServiceImpl implements SellerService{
    private TSellerMapper sellerMapper;

    public TSellerMapper getSellerMapper() {
        return sellerMapper;
    }

    public void setSellerMapper(TSellerMapper sellerMapper) {
        this.sellerMapper = sellerMapper;
    }
}
