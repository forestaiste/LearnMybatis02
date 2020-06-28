package com.forest.mapper;

import com.forest.bean.Emp;

import java.util.List;

public interface EmpMapper {

    Emp getEmpByEid(String eid);

    List<Emp> getAllEmp();

    void addEmp(Emp emp);

    void updateEmp(Emp emp);

    Boolean deleteEmp(String eid);
}
