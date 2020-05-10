package com.syly8.SpringBootDemo.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JpaController {

    private static final Logger log = LoggerFactory.getLogger(JpaController.class);

    @Autowired
    CustomerRepository cusrepo;


    @GetMapping("/jpa/load")
    public String LoadAllCustomer(Model model) {
        List<Customer> lstCus = new ArrayList<>();
        cusrepo.findAll().forEach(cus->lstCus.add(cus));
        model.addAttribute("customers", lstCus);

        model.addAttribute("customer", new Customer());
        return "jpahome";
    }

    @PostMapping("/jpa/create")
    public String createCustomer(@ModelAttribute Customer customer) {
        log.info(customer.toString());
        cusrepo.save(customer);
        return "redirect:/jpa/load";
    }

    @PostMapping("/jpa/delete")
    public String deleteCustomer(long cid) {
        cusrepo.deleteById(cid);
        return "redirect:/jpa/load";
    }

    @PostMapping("/jpa/update")
    public String deleteCustomer(@ModelAttribute Customer customer) {
        cusrepo.save(customer);
        return "redirect:/jpa/load";
    }






}
