package com.forest.mapper;

import com.forest.bean.Emp;
import com.forest.bean.Dept;

import java.util.List;

public interface EmpDeptMapper {

    List<Emp> getAllEmp();

    Emp getEmpStep(String eid);

    Dept getDeptEmpsByDid(String did);

    Dept getOnlyDeptByDid(String did);

    List<Emp> getEmpListByDid(String did);
}
