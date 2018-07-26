package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CookieController {

    @RequestMapping("/find")
    public String findCookie(HttpServletRequest request) {
        //获取Cookie
        //获取request
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            cookie.getName();
            cookie.getValue();
        }
        if (true){
            return "index";
        }
        return "success";
    }
}
