package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;

/**
 * @Author JSQ
 * @Date 2020/9/28 23:55
 * @Version 1.0
 */
public interface PaymentDao {
    int insert(Payment payment);

    Payment getPaymentById(Long id);
}
