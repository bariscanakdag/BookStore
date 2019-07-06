package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/admin")
public class AdminController {


    @RequestMapping(method = RequestMethod.GET)
    public String getAdminPanel(HttpServletRequest request, HttpServletResponse response, Model theModel){
        return "adminpage";
    }


}
