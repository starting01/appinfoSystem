package com.yqf.controller;

import com.yqf.pojo.AppInfo;
import com.yqf.pojo.DevUser;
import com.yqf.service.appinfo.AppInfoService;
import com.yqf.service.devuser.DevUserService;
import com.yqf.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import java.math.BigInteger;
import java.util.List;

/**
 * @author peak
 * @Version 1.0
 */
@Controller
@RequestMapping("/dev")
public class DevUserController {

    @Autowired
    private DevUserService devUserService;
    @Autowired
    private AppInfoService appInfoService;

    //登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String devLogin(@RequestParam(value = "devCode", required = true) String devCode , @RequestParam(value = "devPassword", required = true) String devPassword, HttpSession session, Model model){

        DevUser devUser = devUserService.getDevUserByName(devCode,MD5Util.getMD5Plus(devPassword));

        //判断用户是否存在
        if(devUser != null ){
            DevUser developer = new DevUser();
            developer.setId(devUser.getId());
            developer.setDevCode(devCode);
            session.setAttribute("devUserSession",developer);
            return "developer/main";
        }
        model.addAttribute("error","用户名或密码错误");
        return "devlogin";
    }

    //登出
    @RequestMapping(value = "/logout")
    public String devLogout(HttpSession session){
        session.removeAttribute("devUserSession");
        return "/devlogin";
    }

    //app信息列表
    @RequestMapping(value = "/flatform/app/list")
    public String appList(Model model){
        List<AppInfo> appInfos = appInfoService.appInfoList();
        model.addAttribute("appInfoList",appInfos);
        return "/developer/appinfolist";
    }






}
