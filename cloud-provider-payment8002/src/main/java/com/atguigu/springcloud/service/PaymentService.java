package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @Author JSQ
 * @Date 2020/9/29 0:00
 * @Version 1.0
 */
public interface PaymentService {
    int insert(Payment payment);

    Payment getPaymentById(Long id);
}
