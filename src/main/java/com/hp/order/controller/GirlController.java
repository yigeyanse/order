package com.hp.order.controller;

import com.hp.order.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaodong
 * @title
 * @date 2019/10/11 16:01
 * @desc
 */
@RestController
@RequestMapping("/girl")
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("/print")
    public String print(){
        return girlConfig.getName() + "-"  + girlConfig.getAge() + "岁";
    }
}
