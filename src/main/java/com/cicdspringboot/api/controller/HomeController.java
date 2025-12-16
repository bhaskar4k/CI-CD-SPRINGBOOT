package com.cicdspringboot.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Home")
public class HomeController {
    @GetMapping("HelloCiCd")
    public String HelloCiCd(){
        return "CI/CD is working on localhost.";
    }
}
