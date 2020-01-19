package com.newbin.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author fengjiabin
 * @date 2020/1/16 11:55
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy //开启网关zuul代理
public class GatewayBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(GatewayBootstrap.class, args);
        log.info("bin -> gateway-center 网关中心已启动...");
    }

}
