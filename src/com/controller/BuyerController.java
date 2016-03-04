package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BuyerController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("asdas");
        return "index.jsp";
    }
}
