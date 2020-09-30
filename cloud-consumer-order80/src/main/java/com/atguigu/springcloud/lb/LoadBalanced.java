package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author JSQ
 * @Date 2020/9/30 16:46
 * @Version 1.0
 */
public interface LoadBalanced {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
