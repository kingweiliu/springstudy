package com.syly8.SpringBootDemo.RestService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/rest/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "ljw") String name) {
        return new Greeting(counter.incrementAndGet(), name);
    }

    @GetMapping("/rest/getuid/{id}")
    public String getRequestParam(@PathVariable("id")int userid) {
        return "getRequestParam:" + userid;
    }

}
