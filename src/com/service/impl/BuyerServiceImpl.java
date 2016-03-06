package com.service.impl;

import com.mapper.TBuyerMapper;
import com.models.TBuyer;
import com.models.TBuyerExample;
import com.service.BuyerService;

import java.util.List;

public class BuyerServiceImpl implements BuyerService{
    private TBuyerMapper buyerMapper;

    public TBuyerMapper getBuyerMapper() {
        return buyerMapper;
    }

    public void setBuyerMapper(TBuyerMapper buyerMapper) {
        this.buyerMapper = buyerMapper;
    }

    public TBuyer login(String username,String password){
        TBuyerExample buyerExample = new TBuyerExample();
        TBuyerExample.Criteria criteria = buyerExample.createCriteria();
        criteria.andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<TBuyer> list = buyerMapper.selectByExample(buyerExample);
        if(list.size()==0) return null;
        else return list.get(0);
    }
}
