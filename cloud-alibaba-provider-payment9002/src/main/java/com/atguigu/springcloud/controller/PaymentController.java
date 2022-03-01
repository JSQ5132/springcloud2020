package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author JSQ
 * @Date 2020/9/29 0:02
 * @Version 1.0
 */
@RestController

public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String getPaymentById(@PathVariable("id") Long id){
        return "nacos注册中心，serverPort:"+serverPort+"\t id:"+id;
    }


}
