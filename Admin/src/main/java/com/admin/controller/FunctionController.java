package com.admin.controller;

import com.admin.model.Function;
import com.admin.model.FunctionControl;
import com.admin.service.IFunctionControlService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/functionControl")
public class FunctionController {

    @Resource
    private IFunctionControlService functionControlService;

    @RequestMapping(value = "/index")
    public String index(Model model, HttpServletRequest request){

        List<FunctionControl> functionControlList = functionControlService.getAllFunctionControl();

        model.addAttribute("functionControlList",functionControlList);

        return "/WEB-INF/jsp/functionControl.jsp";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public @ResponseBody FunctionControl update(@RequestBody FunctionControl functionControl){

            functionControlService.updateFunctionControl(functionControl.getId(), functionControl.getStatus());
            functionControl = functionControlService.getFunctionControl(functionControl.getId());

        return functionControl;
    }
}
