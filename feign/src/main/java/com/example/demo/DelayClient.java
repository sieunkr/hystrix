package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "delay-api", url = "localhost:8081", fallback = DelayClientFallback.class)
public interface DelayClient {

    @GetMapping("/api/delay")
    String get();
}