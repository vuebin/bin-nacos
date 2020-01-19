package com.newbin.sftp;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * sftp服务启动类
 *
 * @author fengjiabin
 * @date 2020/1/15 16:26
 */
@Slf4j
@SpringBootApplication
@EnableDubbo
@EnableDiscoveryClient
public class SftpApplication {

//    @Resource
//    private SftpServiceImpl sftpService;

    public static void main(String[] args) {
        SpringApplication.run(SftpApplication.class,args);
        log.info("bin -> sftp-service 项目已启动...");
    }

//    @GetMapping("/2")
//    public Object getObject2() {
//        return sftpService.getObject();
//    }

}
