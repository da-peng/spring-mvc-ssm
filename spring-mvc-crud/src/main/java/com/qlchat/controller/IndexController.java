package com.qlchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model m){
        m.addAttribute("someAttribute","11111");
        return "index";
    }

}
