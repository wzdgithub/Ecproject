package com.service.impl;

import com.mapper.TLogisticsMapper;
import com.service.LogisticsService;

public class LogisticsServiceImpl implements LogisticsService{
    private TLogisticsMapper logisticsMapper;

    public TLogisticsMapper getLogisticsMapper() {
        return logisticsMapper;
    }

    public void setLogisticsMapper(TLogisticsMapper logisticsMapper) {
        this.logisticsMapper = logisticsMapper;
    }
}
