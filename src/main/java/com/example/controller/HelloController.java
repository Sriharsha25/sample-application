package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/hello")
public class HelloController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello() {
        return "Hello";
    }
}
