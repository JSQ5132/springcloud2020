package com.atguigu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author JSQ
 * @Date 2020/9/29 0:14
 * @Version 1.0
 */
@Configuration
@MapperScan("com.atguigu.springcloud.dao") //该注解的作用的扫描改包的持久层接口，创建实现类并交给spring管理。
public class MybatisConfig {
}
