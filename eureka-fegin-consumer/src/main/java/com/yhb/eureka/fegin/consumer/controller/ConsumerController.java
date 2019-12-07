package com.yhb.eureka.fegin.consumer.controller;

import com.yhb.eureka.fegin.consumer.controller.fegin.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ProviderClient hiClient;

    @RequestMapping("/feignHi")
    public String feignHi(){
        return hiClient.hi(" feign yhb");
    }



}
