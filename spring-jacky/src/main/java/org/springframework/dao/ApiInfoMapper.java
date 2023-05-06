package org.springframework.dao;

import org.springframework.pojo.ApiInfo;

import java.util.List;

public interface ApiInfoMapper {


    List<ApiInfo> selectAll();
}
