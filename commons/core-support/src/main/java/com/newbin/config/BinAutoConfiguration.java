package com.newbin.config;

import com.newbin.config.properties.BinProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fengjiabin
 * @date 2019/11/13 11:01
 */
@Configuration
public class BinAutoConfiguration {

    @Bean
    public BinProperties BinProperties() {
        return new BinProperties();
    }

}
