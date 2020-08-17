package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @program: userserviceprovider
 * @description:
 * @author: Long Ao Tian
 * @create: 2020-08-16 12:48
 **/
public class UserServiceImpl  implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress1=new UserAddress(1,"北京市","1","李老师","oo","1");
        UserAddress userAddress2=new UserAddress(2,"北京市","1","李老师","oo","1");
        return Arrays.asList(userAddress1,userAddress2);
    }
}

