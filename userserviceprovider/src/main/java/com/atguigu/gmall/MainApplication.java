package com.atguigu.gmall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: parent
 * @description:
 * @author: Long Ao Tian
 * @create: 2020-08-16 14:05
 **/
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("provider.xml");
        ac.start();
        System.in.read();// 按任意键退出
    }
}

