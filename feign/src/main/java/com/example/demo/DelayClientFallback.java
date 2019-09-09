package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DelayClientFallback implements DelayClient {

    @Override
    public String get() {
        try {
            throw new Exception("dd");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
