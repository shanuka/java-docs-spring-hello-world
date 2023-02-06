package com.mickiesoft.UPrinceV5CheckIn.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/ihihoihoihoih")
    public String index() {
        return "Greetings from Azure Spring Apps!";
    }

}
