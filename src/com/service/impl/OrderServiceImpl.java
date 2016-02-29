package com.service.impl;

import com.mapper.TOrderMapper;
import com.service.OrderService;

public class OrderServiceImpl implements OrderService{
    private TOrderMapper orderMapper;

    public TOrderMapper getOrderMapper() {
        return orderMapper;
    }

    public void setOrderMapper(TOrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }
}
