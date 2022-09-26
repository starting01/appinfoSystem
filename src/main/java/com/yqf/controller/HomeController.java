package com.yqf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author peak
 * @Version 1.0
 */
@Controller
public class HomeController {
    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }
    @RequestMapping("dev/toLogin")
    public String toDevLogin(){
        return "devlogin";
    }
    @RequestMapping("manager/login")
    public String toMaLogin(){
        return "jsp/backendlogin";
    }



}
