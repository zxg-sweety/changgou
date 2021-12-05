package com.changgou;/*
 *@Date2021/12/511:58
 *@AuthorAdministrator
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient//开始eureka客户端
@MapperScan(basePackages = {"com.changgou.dao"}) // 开启通用Mapper的包扫描
public class GoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class,args);

    }
}
