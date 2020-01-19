package com.newbin.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * bin 配置类
 *
 * @author fengjiabin
 * @date 2020/1/15 16:35
 */
@Data
@Component
@ConfigurationProperties(prefix = "bin")
public class BinProperties {

    /**
     * 名称
     */
    private String name;

    /**
     * 服务名称
     */
    private String service;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 手机号
     */
    private String phone;

}
