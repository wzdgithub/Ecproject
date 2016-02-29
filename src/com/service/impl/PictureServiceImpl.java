package com.service.impl;

import com.mapper.TPictureMapper;
import com.service.PictureService;

public class PictureServiceImpl implements PictureService{
    private TPictureMapper pictureMapper;

    public TPictureMapper getPictureMapper() {
        return pictureMapper;
    }

    public void setPictureMapper(TPictureMapper pictureMapper) {
        this.pictureMapper = pictureMapper;
    }
}
