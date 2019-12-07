package com.yhb.eureka.fegin.consumer.controller.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-provider",fallback = ProviderClientFallback.class)
public interface ProviderClient {

    @RequestMapping("/hi")
    public String hi(@RequestParam String name);
}
