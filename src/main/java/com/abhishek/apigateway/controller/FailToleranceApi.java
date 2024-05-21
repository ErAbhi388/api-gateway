package com.abhishek.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class FailToleranceApi {

    @GetMapping("/userservicefallback")
    public String userServiceFallBack() {
        return "User Service is currently down";
    }

    @GetMapping("/contactservicefallback")
    public String contactServiceFallBack() {
        return "Contact Service is currently down";
    }
}
