package com.tucha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class IndexConteroller {

    @GetMapping("/test")
    public String index(){
        return "OK!";
    }

}
