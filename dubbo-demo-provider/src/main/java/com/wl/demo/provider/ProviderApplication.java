package com.wl.demo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author wl
 * @date 2019/3/20
 */

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.wl.demo.provider.impl")
public class ProviderApplication {

    public static void main(String[] args){
        SpringApplication.run(ProviderApplication.class, args);
    }
}
