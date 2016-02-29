package com.service.impl;

import com.mapper.TShippingAddressMapper;
import com.service.ShippingAddressService;

public class ShippingAddressServiceImpl implements ShippingAddressService{
    private TShippingAddressMapper shippingAddressMapper;

    public TShippingAddressMapper getShippingAddressMapper() {
        return shippingAddressMapper;
    }

    public void setShippingAddressMapper(TShippingAddressMapper shippingAddressMapper) {
        this.shippingAddressMapper = shippingAddressMapper;
    }
}
