package com.controller;

import com.models.TBuyer;
import com.service.BuyerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class BuyerController {
    private BuyerService buyerService;

    public BuyerService getBuyerService() {
        return buyerService;
    }

    public void setBuyerService(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @RequestMapping("/login")
    public void login(@RequestParam(value = "username") String username,
                      @RequestParam(value = "password") String password,
                      HttpServletResponse response,
                      HttpSession session) throws Exception{
        TBuyer buyer = buyerService.login(username, password);
        response.setCharacterEncoding("utf-8");
        if (buyer == null) {
            response.getWriter().print("error");
        }else {
            session.setAttribute("user",buyer);
        }
    }

    public void register(TBuyer buyer,HttpServletResponse response) throws Exception{
        if(buyerService.checkRegister(buyer.getUsername())){
            buyerService.register(buyer);
        }else{
            response.getWriter().print("same_username");
        }
    }
}
