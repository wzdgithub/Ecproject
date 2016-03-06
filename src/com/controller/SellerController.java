package com.controller;

import com.models.TSeller;
import com.service.SellerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class SellerController {
    private SellerService sellerService;

    public SellerService getSellerService() {
        return sellerService;
    }

    public void setSellerService(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    public void login(@RequestParam(value = "username") String username,
                      @RequestParam(value = "password") String password,
                      HttpServletResponse response,
                      HttpSession session) throws Exception{
        TSeller seller = sellerService.login(username,password);
        response.setCharacterEncoding("utf-8");
        if (seller == null) {
            response.getWriter().print("error");
        }else {
            session.setAttribute("seller",seller);
        }
    }

    public void register(TSeller seller,HttpServletResponse response) throws Exception{
        if(sellerService.checkRegister(seller.getUsername())){
            sellerService.register(seller);
        }else {
            response.getWriter().print("same_username");
        }
    }
}
