package com.qlchat.controller;


import com.qlchat.bean.UserInfo;
import com.qlchat.utils.LogUtils;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/")
public class IndexController {

    private static final String template = "Hello, %s!";
    Logger logger = LogUtils.getBussinessLogger();

// http://localhost:8082/?name=xh

//    @GetMapping("/")

    /**
     * 返回页面
     *
     * @param name
     * @param m
     * @return
     */
//    @RequestMapping(value = "/", method = GET)
    @GetMapping("/")
    public String index(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model m) {

        m.addAttribute("someAttribute", String.format(template, name));
//        logger.info("Bussiness！！");
        return "index";
    }

    /*

    @PostMapping("/login")
    public String login(@RequestParam(value = "username") String name,
                        @RequestParam(value = "password", required = false) String password) {

        return null;
    }
    */

    @RequestMapping("/login")
    public String login(UserInfo user, HttpSession httpSession, Model m) {

        String username = user.getUsername();
        String password = user.getPassword();

        if (username.equals("wuxiaopeng" )&& password.equals( "123456")) {
            httpSession.setAttribute("userToken", "XXXXXXXX");
            m.addAttribute("someAttribute", String.format(template, username));
            return "index";
        } else {
            return "login";
        }
    }


}
