package com.service.impl;

import com.mapper.TAdvertisementMapper;
import com.service.AdvertisementService;

public class AdvertisementServiceImpl implements AdvertisementService{
    private TAdvertisementMapper advertisementMapper;

    public TAdvertisementMapper getAdvertisementMapper() {
        return advertisementMapper;
    }

    public void setAdvertisementMapper(TAdvertisementMapper advertisementMapper) {
        this.advertisementMapper = advertisementMapper;
    }
}
