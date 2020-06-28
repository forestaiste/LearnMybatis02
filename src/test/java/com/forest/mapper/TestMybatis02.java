package com.forest.mapper;

import com.forest.bean.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class TestMybatis02 {

    @Test
    public void testCRUD() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = empMapper.getEmpByEid("1");
        System.out.println(emp);

        List<Emp> emps = empMapper.getAllEmp();
        System.out.println(emps);

        emp.setEname("Jackson");
        empMapper.updateEmp(emp);

        emp = empMapper.getEmpByEid("1");
        System.out.println(emp);

        Boolean i = empMapper.deleteEmp("4");
        System.out.println("Deleted result: " + i);

        empMapper.addEmp(new Emp(null, "Swatti", 34, "Female"));
        sqlSession.commit();

        EmpSelectMapper selectMapper = sqlSession.getMapper(EmpSelectMapper.class);
        int count = selectMapper.getCount();

        System.out.println("Emp count: " + count);

        Map<String, Object> empMap = selectMapper.getAllEmpMap();
        System.out.println(empMap);
    }
}
