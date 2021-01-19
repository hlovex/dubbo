package com.hlovex.demo.service.impl;

import com.hlovex.demo.service.DemoService;

/**
 * Created by hlovex on 2021/1/19 23:08
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
