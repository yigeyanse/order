package com.hp.order.controller;

import com.hp.order.config.GirlConfig;
import com.hp.product.client.service.ProductClient;
import com.hp.product.common.domain.ProductOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xiaodong
 * @title
 * @date 2019/10/11 13:13
 * @desc
 */
@RestController
@RequestMapping("/order")
@RefreshScope
public class OrderController {

    @Value("${env}")
    private String env;

    @Autowired
    private ProductClient productClient;

    @GetMapping("/printEnv")
    public  String printEnv(){
        return env;
    }

    @GetMapping("/getOrderInfo")
    public  List<ProductOutput> getOrderInfo(){
            List<ProductOutput> list =  productClient.getProductList();
            System.out.println(list);
            return  list;
    }

}
