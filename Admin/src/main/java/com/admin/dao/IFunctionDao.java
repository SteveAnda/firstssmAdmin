package com.admin.dao;

import com.admin.model.Function;
import com.admin.model.FunctionControl;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IFunctionDao {

    //查询所有
    List<FunctionControl> selectAllFunction();

    //查询一条
    FunctionControl selectFunction(long id);

    //更新一条
    void updateFunction(@Param("id") long id, @Param("status") int status);
}
