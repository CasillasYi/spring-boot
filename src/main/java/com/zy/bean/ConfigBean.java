package com.zy.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by zhangyi-ds6 on 2017/3/16.
 */
@ConfigurationProperties(prefix = "com.zy")
public class ConfigBean {

    private String name;

    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
