package com.newbin.sftp.service;

import com.newbin.api.SftpService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author fengjiabin
 * @date 2020/1/15 16:44
 */
@Service
public class SftpServiceImpl implements SftpService {

//    @Resource
//    private BinProperties binProperties;

    @Value("${bin.tip1}")
    private String tip1;

    public Object getObject () {
        return "| sftp service provider ... ";
    }

    public String test1(String name) {
        return name + tip1;
    }

}
