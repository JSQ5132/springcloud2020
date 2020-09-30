package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author JSQ
 * @Date 2020/9/29 0:02
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;


    @PostMapping("/payment/save")
    public CommonResult insert(@RequestBody Payment payment){
        int result = paymentService.insert(payment);
        log.info("插入结果"+result);
        if (result > 0) {
            return new CommonResult(200,"插入数据成功,serverPort:"+serverPort,result);
        }else {
            return new CommonResult(501,"插入数据失败,serverPort:"+serverPort,null);
        }

    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("查询结果"+result);
        if (result != null ) {
            return new CommonResult(200,"查询数据成功,serverPort:"+serverPort,result);
        }else {
            return new CommonResult(501,"查询数据失败,serverPort:"+serverPort,id);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
