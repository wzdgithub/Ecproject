package com.service.impl;

import com.mapper.TCollectionMapper;
import com.service.CollectionService;

public class CollectionServiceImpl implements CollectionService{
    private TCollectionMapper collectionMapper;

    public TCollectionMapper getCollectionMapper() {
        return collectionMapper;
    }

    public void setCollectionMapper(TCollectionMapper collectionMapper) {
        this.collectionMapper = collectionMapper;
    }
}
