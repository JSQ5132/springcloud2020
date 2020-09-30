package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author JSQ
 * @Date 2020/9/30 11:39
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderConsulController {

    public static final String INVOME_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentInfo (){
        String result = restTemplate.getForObject(INVOME_URL+"/payment/consul",String.class);
        return result;
    }
}
