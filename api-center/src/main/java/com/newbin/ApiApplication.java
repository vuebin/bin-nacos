package com.newbin;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * system服务启动类
 *
 * @author fengjiabin
 * @date 2020/1/15 16:26
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class,args);
        log.info("bin -> api-center 项目已启动...");
    }

}
