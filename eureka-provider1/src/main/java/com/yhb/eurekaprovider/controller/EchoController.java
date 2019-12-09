package com.yhb.eurekaprovider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    private Logger log = LoggerFactory.getLogger(EchoController.class);

    @Value("${server.port}")
    Integer port;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        log.info("-->invoke provider1 hi method");
        return "hi "+name+",i am from port:" +port;
    }
}
