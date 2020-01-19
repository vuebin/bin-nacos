package com.newbin.controller;

import com.newbin.api.SftpService;
import com.newbin.api.SystemService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengjiabin
 * @date 2020/1/15 16:40
 */
@RestController
public class BinController {

    @Reference
    private SystemService systemService;

    @Reference
    private SftpService sftpService;

    @GetMapping("/1")
    public Object getObject1() {
        return "api-center " + systemService.getObject();
    }

    @GetMapping("/test1")
    public String test1(@RequestParam String name) {
        return sftpService.test1(name);
    }

    @GetMapping("/test2")
    public String test2(@RequestParam String name) {
        return systemService.test2(name);
    }

}
