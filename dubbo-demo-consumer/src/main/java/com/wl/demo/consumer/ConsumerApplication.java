package com.wl.demo.consumer;

import com.wl.demo.consumer.impl.ConsumerDemoImpl;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author wl
 * @date 2019/3/20
 */

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.wl.demo.consumer.impl")
public class ConsumerApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(ConsumerApplication.class);
    }
}
