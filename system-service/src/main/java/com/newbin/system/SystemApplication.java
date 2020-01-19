package com.newbin.system;

import com.newbin.api.SystemService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * system服务启动类
 *
 * @author fengjiabin
 * @date 2020/1/15 16:26
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableDubbo
public class SystemApplication {

    @Reference
    private SystemService systemService;

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class,args);
        log.info("bin -> system-service 项目已启动...");
    }

    @GetMapping("/3")
    public Object getObject1() {
        return systemService.getObject();
    }

}
