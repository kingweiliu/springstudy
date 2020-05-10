package com.syly8.SpringBootDemo.validatingforminput;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class WebController implements WebMvcConfigurer {

    private static final Logger log = LoggerFactory.getLogger(WebController.class);

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/validform/results").setViewName("validresults");
    }

    @GetMapping("/validform")
    public String showForm(PersonForm personForm) {
        return "validform";
    }

    @PostMapping("/validform")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.info("has error:" + bindingResult.toString());
            return "validform";
        }
        log.info("has no error:" + personForm.toString());
        return "redirect:/validform/results";
    }


}
