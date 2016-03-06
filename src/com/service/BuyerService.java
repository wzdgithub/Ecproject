package com.service;

import com.models.TBuyer;

public interface BuyerService {
    TBuyer login(String username,String password);
    boolean checkRegister(String username);
    void register(TBuyer buyer);
}
