package com.syly8.SpringBootDemo.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JpaController {

    @Autowired
    CustomerRepository cusrepo;


    @GetMapping("/jpa/load")
    public String LoadAllCustomer(Model model, @PathVariable long id) {
        List<Customer> lstCus = new ArrayList<>();
        cusrepo.findAll().forEach(cus->lstCus.add(cus));
        model.addAttribute("customers", lstCus);

        Customer cus = cusrepo.findById(id);
        model.addAttribute("current", cus);
        return "jpahome";
    }


}
