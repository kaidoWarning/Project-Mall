package com.example.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *openFeign 的使用 ：
 *  开启openFeign代理
 *  编写openFeign接口  注明需要远程调用的服务接口位置
 *  接口 RequestMapping 注明请求调用远程路径
 *  开启远程调用的工能
 *
 */

@EnableFeignClients(basePackages = "com.example.mall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
