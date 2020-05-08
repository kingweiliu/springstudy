package com.syly8.SpringBootDemo.handlingformsubmission;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.lang.reflect.Modifier;

@Controller
public class FormGreetingController {

    @GetMapping("/formsub/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/formsub/greeting")
    public String greetingForm(@ModelAttribute Greeting greeting) {
        return "result";
    }


}
