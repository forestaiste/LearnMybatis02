package com.forest.mapper;

import org.apache.ibatis.annotations.MapKey;

import java.util.Map;

public interface EmpSelectMapper {

    Integer getCount();

    @MapKey("eid")
    Map<String, Object> getAllEmpMap();
}
