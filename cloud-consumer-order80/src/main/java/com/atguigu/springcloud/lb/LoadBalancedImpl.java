package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author JSQ
 * @Date 2020/9/30 16:49
 * @Version 1.0
 */
@Component
public class LoadBalancedImpl implements  LoadBalanced{
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final  int  getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }
        while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("******第几次请求访问服务，次数next:"+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
