package com.forest.mapper;

import com.forest.bean.Dept;
import com.forest.bean.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestEmpDept {

    @Test
    public void testParam() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        EmpDeptMapper mapper = sqlSession.getMapper(EmpDeptMapper.class);

//        List<Emp> emps = mapper.getAllEmp();
//        System.out.println(emps);
//        Emp emp = mapper.getEmpStep("3");
//        System.out.println(emp);
//
//        System.out.println(emp.getDept());

//        Dept dept = mapper.getDeptEmpsByDid("2");
//
//        System.out.println(dept);

        Dept dept = mapper.getOnlyDeptByDid("3");
        System.out.println(dept.getDname());

        System.out.println(dept.getEmps());

    }
}
