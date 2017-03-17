package com.zy.controller;

import com.zy.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangyi-ds6 on 2017/3/16.
 */
@RestController
public class UserController {

    @Autowired
    private ConfigBean configBean;


    @RequestMapping("/name")
    public String hey(){
        return configBean.getName()+":"+configBean.getValue();
    }
}
