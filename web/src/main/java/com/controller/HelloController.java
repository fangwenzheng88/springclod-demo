package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
	@Value("${test}")
	private String test;

    @Value("${test2}")
    private String test2;
	
	@GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return test + test2;
    }
}
