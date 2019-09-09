package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    private final DelayClient delayClient;

    public HomeController(DelayClient delayClient) {
        this.delayClient = delayClient;
    }

    @GetMapping
    public String home(){
        return delayClient.get();
    }
}
