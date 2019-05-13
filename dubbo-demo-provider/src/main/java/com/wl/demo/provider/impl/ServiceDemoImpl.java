package com.wl.demo.provider.impl;

import com.wl.demo.api.IServiceDemo;
import org.apache.dubbo.config.annotation.Service;


/**
 *
 * @author wl
 * @date 2019/3/20
 */

@Service
public class ServiceDemoImpl implements IServiceDemo {

    public String sayHello(String name) {
        return "Hello" + name;
    }
}
