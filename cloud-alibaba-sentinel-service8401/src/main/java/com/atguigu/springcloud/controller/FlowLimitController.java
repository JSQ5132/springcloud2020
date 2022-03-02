package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author JSQ
 * @Date 2022/3/2 16:34
 * @Version 1.0
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        try {
            //该线程休眠0.8秒
            TimeUnit.MILLISECONDS.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "========testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "========testB";
    }

}
