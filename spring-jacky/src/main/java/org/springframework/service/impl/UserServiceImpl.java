package org.springframework.service.impl;

import org.springframework.dao.ApiInfoMapper;
import org.springframework.service.UserService;

public class UserServiceImpl implements UserService {


    private ApiInfoMapper apiInfoMapper;

    public UserServiceImpl() {
        System.out.println("调用无参构造！");
    }

    public void setApiInfoMapper(ApiInfoMapper apiInfoMapper) {
        this.apiInfoMapper = apiInfoMapper;
    }

    public int getSize() {
        return apiInfoMapper.selectAll().size();
    }
}
