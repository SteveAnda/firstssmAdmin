package com.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/enterTest/")
public class TestController {

    @RequestMapping(value = "/test1/{id}")
    public String test(@PathVariable int id, ModelMap modelMap){

        modelMap.put("id",id);

        return "/WEB-INF/html/test.html";
    }
}
