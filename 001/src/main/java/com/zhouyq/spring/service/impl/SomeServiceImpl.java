package com.zhouyq.spring.service.impl;

import com.zhouyq.spring.service.SomeService;

/**
 * @Description TODO
 * @Date 2020/4/25 17:20
 * @Author zhouyq
 */
public class SomeServiceImpl implements SomeService {

    /**
     *    如果没有无参构造方法Spring默认创建对象就会报错
     */
    public SomeServiceImpl() {
        System.out.println("无参构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("SomeServiceImpl + 业务方法 doSome");
    }
}
