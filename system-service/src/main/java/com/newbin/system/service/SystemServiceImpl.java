package com.newbin.system.service;

import com.newbin.api.SftpService;
import com.newbin.api.SystemService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author fengjiabin
 * @date 2020/1/15 16:41
 */
@Service
public class SystemServiceImpl implements SystemService {

    @Reference
    private SftpService sftpService;

    @Value("${bin.tip2}")
    private String tip2;

    public Object getObject () {
        return "system-service provider... " + sftpService.getObject();
    }

    public String test2(String name) {
        return tip2 + sftpService.test1(name);
    }

}
