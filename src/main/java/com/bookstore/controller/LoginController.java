package com.bookstore.controller;

import com.bookstore.entity.User;
import com.bookstore.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/auth")
public class LoginController {

    @Resource(name = "securityServiceImpl")
    private SecurityService securityService;

    private static final String LOGINPAGE_NAME="Giriş Yap";

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage(HttpServletRequest request, HttpServletResponse response, Model theModel) {
        theModel.addAttribute("title", LOGINPAGE_NAME);
        theModel.addAttribute("user",new User());
        return "login";
    }

    @RequestMapping(value = "/login",method =RequestMethod.POST)
    public  String checkUser(HttpServletRequest request, HttpServletResponse response, Model theModel,
                             @ModelAttribute("user")User user, BindingResult result){

        securityService.autoLogin(user.getUserName(),user.getPassword());
        return  "adminpage";
    }
}
