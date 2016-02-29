package com.service.impl;

import com.mapper.TShopMapper;
import com.service.ShopService;

public class ShopServiceImpl implements ShopService{
    private TShopMapper shopMapper;

    public TShopMapper getShopMapper() {
        return shopMapper;
    }

    public void setShopMapper(TShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }
}
