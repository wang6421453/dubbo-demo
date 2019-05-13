package com.wl.demo.consumer.impl;

import com.wl.demo.api.IServiceDemo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 *
 * @author wl
 * @date 2019/5/13
 */

@Service
public class ConsumerDemoImpl {

    @Reference
    private IServiceDemo serviceDemo;

    public String sayHello(String name){
        String result = serviceDemo.sayHello(name);
        return result;
    }
}
