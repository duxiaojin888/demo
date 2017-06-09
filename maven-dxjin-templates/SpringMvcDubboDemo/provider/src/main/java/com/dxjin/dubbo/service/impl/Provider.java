package com.dxjin.dubbo.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;

/**
 * Created by wy on 2017/4/13.
 */
public class Provider {
        public static void main(String[] args) throws IOException {
//            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
//            System.out.println(context.getDisplayName() + ": here");
//            context.start();
//            System.out.println("服务已经启动...");
//            System.in.read();



            ApplicationContext context = new FileSystemXmlApplicationContext(
                    "SpringMvcDubboDemo/provider/src/main/resources/applicationContext.xml");
            System.out.println("服务已经启动...");
            System.in.read(); // 按任意键退出

        }
    }

