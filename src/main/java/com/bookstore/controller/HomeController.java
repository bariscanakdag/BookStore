package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class TestController {

    @GetMapping
    public  String getPageMain(){
        return "index";
    }

    @GetMapping("/footer")
    public String getFooter(HttpServletRequest request,HttpServletResponse response,Model theModel){
        response.setStatus(500);
        return "footer";
    }

    @GetMapping("/header")
    public  String getPageHeader(Model theModel){
        theModel.addAttribute("aaaaaaaaaaa","asd");
        return "header";
    }


}
