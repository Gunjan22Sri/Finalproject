package com.realestate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.realestate.Service.Realestateservice;
import com.realestate.bean.Realestate;

@Controller
public class realestate {
    @Autowired
    private Realestateservice service;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/helpus")
    public String getHelpus() {
        return "helpus";
    }

    @GetMapping("/homepage")
    public String getHomepage() {
        return "homepage";
    }

    @GetMapping("/signup")
    public String getSignup() {
        return "signup";
    }

    @GetMapping("/aboutus")
    public String getAboutus() {
        return "aboutus";
    }
    @GetMapping("/lingampally")
    public String getLingampally() {
        return "lingampally";
    }
    @GetMapping("/table")
    public String getTable() {
        return "table";
    }


    @PostMapping("/login")
    public String addLogin(@ModelAttribute Realestate realestate) {
     service.addLogin(realestate);
     System.out.println(realestate);
        return "homepage";

    }
}
