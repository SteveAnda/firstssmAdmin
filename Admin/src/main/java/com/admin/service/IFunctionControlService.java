package com.admin.service;

import com.admin.model.FunctionControl;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IFunctionControlService {

    //查询所有
    public List<FunctionControl> getAllFunctionControl();

    //查询一条
    public FunctionControl getFunctionControl(long id);

    //更新一条
    public void updateFunctionControl(long id, int status);

}
