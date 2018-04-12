package com.admin.controller;

import com.admin.model.User;
import com.admin.service.IUserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@Scope(value = "prototype")
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping(value = "/login")
    public String login(User user, Model model){
        String message = "code:帐号不存在";
        user = userService.checkLogin(user.getUsername(), user.getPassword());
        if(user != null){
            message = "/functionControl/index";
            model.addAttribute(user);
            return message;
        }
        return message;
    }

    @RequestMapping(value = "/loginForm")
    public String loginForm(){
        return "/WEB-INF/jsp/loginForm.jsp";
    }
}
