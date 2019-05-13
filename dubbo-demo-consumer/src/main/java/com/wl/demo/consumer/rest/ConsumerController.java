package com.wl.demo.consumer.rest;

import com.wl.demo.consumer.impl.ConsumerDemoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wl
 * @date 2019/5/13
 */

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerDemoImpl consumerDemo;

    @RequestMapping("/hi")
    public String sayHi(String name){
        return consumerDemo.sayHello(name);
    }
}
