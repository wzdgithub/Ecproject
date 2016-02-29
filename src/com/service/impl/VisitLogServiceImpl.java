package com.service.impl;

import com.mapper.TVisitLogMapper;
import com.service.VisitLogService;

public class VisitLogServiceImpl implements VisitLogService{
    private TVisitLogMapper visitLogMapper;

    public TVisitLogMapper getVisitLogMapper() {
        return visitLogMapper;
    }

    public void setVisitLogMapper(TVisitLogMapper visitLogMapper) {
        this.visitLogMapper = visitLogMapper;
    }
}
