package com.bookstore.controller;

import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.springframework.http.converter.json.JsonbHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public  String getPageMain(){
        return "index";
    }

    @GetMapping("/footer")
    public String getFooter(HttpServletRequest request,HttpServletResponse response,Model theModel){
        return "footer";
    }


    @GetMapping("/header")
    public  String getPageHeader(Model theModel){
        theModel.addAttribute("aaaaaaaaaaa","asd");
        return "header";
    }


}
