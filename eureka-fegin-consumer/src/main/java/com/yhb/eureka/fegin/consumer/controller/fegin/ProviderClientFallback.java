package com.yhb.eureka.fegin.consumer.controller.fegin;

import org.springframework.stereotype.Component;

@Component
public class ProviderClientFallback implements ProviderClient {

    @Override
    public String hi(String name) {
        return "fegin hystrix";
    }
}
