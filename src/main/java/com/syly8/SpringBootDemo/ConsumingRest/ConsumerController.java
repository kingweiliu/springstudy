package com.syly8.SpringBootDemo.ConsumingRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
public class ConsumerController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/accessrest")
    public String accessrest() {
        Quote qt = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        return "access rest:" + new Date().toString() + " :" + qt.toString();
    }
}
