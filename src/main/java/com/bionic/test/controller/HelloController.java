package com.bionic.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "PT Bionic Teknologi Indonesia | Technical Test";
    }
}
