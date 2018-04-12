package com.admin.service.Impl;

import com.admin.dao.IFunctionDao;
import com.admin.model.Function;
import com.admin.model.FunctionControl;
import com.admin.service.IFunctionControlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("functionControlServiceImpl")
public class FunctionControlServiceImpl implements IFunctionControlService {

    @Resource
    private IFunctionDao functionDao;


    @Override
    public List<FunctionControl> getAllFunctionControl() {

        return functionDao.selectAllFunction();
    }

    @Override
    public FunctionControl getFunctionControl(long id) {
        return functionDao.selectFunction(id);
    }

    @Override
    public void updateFunctionControl(long id, int status) {
        functionDao.updateFunction(id, status);
    }
}
