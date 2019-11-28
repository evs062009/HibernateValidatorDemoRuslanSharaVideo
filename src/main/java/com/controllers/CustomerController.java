package com.controllers;

import com.domains.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute(new Customer());
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute Customer customer, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            return "customer-form";
        }
        return "customer-confirmation";
    }
}