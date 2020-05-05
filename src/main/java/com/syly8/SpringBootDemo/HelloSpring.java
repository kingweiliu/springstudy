package com.syly8.SpringBootDemo;

import com.syly8.SpringBootDemo.ConsumingRest.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloSpring {



    @GetMapping("/getuid/{id}")
    public String getRequestParam(@PathVariable("id")int userid) {
        return "getRequestParam:" + userid;
    }
}
