package com.conrail.SiteVisit.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteVisitController {


    @GetMapping("/home")
    public String renderHome() {
        return "home";
    }

    @GetMapping("/home/add")
    public String renderForm() {
        return "form";
    }

    @GetMapping("/home/list")
    public String renderList() {

        return "list";
    }


}
