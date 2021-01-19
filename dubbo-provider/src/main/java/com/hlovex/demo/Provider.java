package com.hlovex.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hlovex on 2021/1/19 23:11
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println("success");
        System.in.read(); // 按任意键退出
    }
}
