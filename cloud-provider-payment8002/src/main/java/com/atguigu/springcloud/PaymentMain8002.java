package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author JSQ
 * @Date 2020/9/28 23:41
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
