package com.service.impl;

import com.mapper.TSellerMapper;
import com.models.TSeller;
import com.models.TSellerExample;
import com.service.SellerService;

import java.util.List;

public class SellerServiceImpl implements SellerService {
    private TSellerMapper sellerMapper;

    public TSellerMapper getSellerMapper() {
        return sellerMapper;
    }

    public void setSellerMapper(TSellerMapper sellerMapper) {
        this.sellerMapper = sellerMapper;
    }

    public TSeller login(String username, String password) {
        TSellerExample sellerExample = new TSellerExample();
        TSellerExample.Criteria criteria = sellerExample.createCriteria();
        criteria.andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<TSeller> list = sellerMapper.selectByExample(sellerExample);
        if (list.size() == 0) return null;
        else return list.get(0);
    }

    public boolean checkRegister(String username) {
        TSellerExample sellerExample = new TSellerExample();
        TSellerExample.Criteria criteria = sellerExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<TSeller> list = sellerMapper.selectByExample(sellerExample);
        if (list.size() == 0) return true;
        else return false;
    }

    public void register(TSeller seller){
        sellerMapper.insert(seller);
    }
}
