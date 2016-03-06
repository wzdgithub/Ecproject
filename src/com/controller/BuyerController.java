package com.controller;

import com.models.TBuyer;
import com.service.BuyerService;
import org.springframework.stereotype.Controller;

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

    public void login(String username,
                      String password,
                      HttpServletResponse response,
                      HttpSession session) throws Exception{
        TBuyer buyer = buyerService.login(username, password);
        if (buyer == null) {
            response.getWriter().print("error");
        }else {
            session.setAttribute("user",buyer);
            response.sendRedirect("index.jsp");
        }
    }

    public void register(TBuyer buyer,HttpServletResponse response) throws Exception{
        if(buyerService.checkRegister(buyer.getUsername())){
            buyerService.register(buyer);
            response.sendRedirect("login.jsp");
        }else{
            response.getWriter().print("same_username");
        }
    }
}
