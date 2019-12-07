package com.yhb.eurekaconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiFallBack")
    public String hi() {
        return restTemplate.getForEntity("http://EUREKA-PROVIDER/hi?name=yhb", String.class).getBody();
    }

    public String hiFallBack(){
        return "hi error";
    }




}
