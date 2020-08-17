package com.atguigu.gmall;

import com.atguigu.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: parent
 * @description:
 * @author: Long Ao Tian
 * @create: 2020-08-16 14:18
 **/
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = classPathXmlApplicationContext.getBean(OrderService.class);
        orderService.intoOrder("1");
        System.out.println("调用完成......");
        System.in.read();
    }

}

