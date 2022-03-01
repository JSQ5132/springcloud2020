package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderPayment9002 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderPayment9002.class, args);
    }

}
