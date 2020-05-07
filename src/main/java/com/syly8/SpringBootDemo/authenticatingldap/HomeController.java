package com.syly8.SpringBootDemo.authenticatingldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/auth")
    public String index() {
        return "welcome to home page";
    }
}
