package com.hp.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author xiaodong
 * @title 配置文件映射类
 * @date 2019/10/11 15:59
 * @desc
 */
@Data
@Component
@ConfigurationProperties("girl")
@RefreshScope
public class GirlConfig {

    private String name;
    private Integer age;
}
