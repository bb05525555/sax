package com.wxcloudrun.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sax")
public class SaxController {

    @GetMapping("/ceshi")
    public String ceshi(){
        return "ok";
    }
}
