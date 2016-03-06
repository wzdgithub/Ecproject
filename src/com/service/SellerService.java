package com.service;

import com.models.TSeller;

public interface SellerService {
    TSeller login(String username, String password);
    boolean checkRegister(String username);
    void register(TSeller seller);
}
