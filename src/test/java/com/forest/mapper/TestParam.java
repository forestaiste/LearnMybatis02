package com.forest.mapper;

import com.forest.bean.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TestParam {

    @Test
    public void testParam() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ParamMapper mapper = sqlSession.getMapper(ParamMapper.class);
//        Emp emp = new Emp(null, "Craig", 45, "Male");
//
//        mapper.insertEmp(emp);
//        sqlSession.commit();

        //System.out.println("Latest id: " + emp.getEid());

//        emp = mapper.getEmpByEid("2");
//        System.out.println(emp);

//        Emp emp = mapper.getEmpByEidAndEname("30", "Craig");
//
//        System.out.println(emp);
//
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("eid", 30);
//        map.put("ename", "Craig");
//
//        emp = mapper.getEmpByMap(map);
//        System.out.println(emp);
        Emp emp = mapper.getEmpByEidAndEnameByParam("30", "Craig");

        System.out.println(emp);
    }
}
