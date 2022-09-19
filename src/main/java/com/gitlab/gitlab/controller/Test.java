package com.gitlab.gitlab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/hung")
    public String haha() {
        return "hung";
    }
}
