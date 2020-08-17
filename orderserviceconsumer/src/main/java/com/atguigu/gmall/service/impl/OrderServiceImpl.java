package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: orderserviceconsumer
 * @description:
 * @author: Long Ao Tian
 * @create: 2020-08-16 12:53
 * 1.将服务提供者注册到注册中心(暴露服务)
 *      1.导入Dubbo依赖，操作zookeeper的客户端(curator)
 *      2. 配置服务提供者
 * 2 让服务消费者去注册中心订阅服务提供则的地址
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;
    @Override
    public void intoOrder(String userId) {
        System.out.println("用户id："+userId);
        // 1.查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress user:userAddressList
             ) {
            System.out.println(user.getUserAddress());
        }
    }
}

