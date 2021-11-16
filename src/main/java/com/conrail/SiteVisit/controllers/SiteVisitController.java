package com.conrail.SiteVisit.controllers;


//import com.conrail.SiteVisit.data.SiteVisitRepository;
import com.conrail.SiteVisit.models.SiteVisit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import com.conrail.SiteVisit.data.SiteVisitData;

import static java.lang.Integer.parseInt;


@Controller
@RequestMapping("/home")
public class SiteVisitController {

//    @Autowired
//    private SiteVisitRepository siteVisitRepository;
//
//

    @GetMapping
    public String renderHome() {
        return "home";
    }

    @GetMapping("add")
    public String renderForm() {
        return "form";
    }

    @PostMapping("add")
    public String submitEvent(@ModelAttribute SiteVisit newSiteVisit) {
        SiteVisitData.add(newSiteVisit);
                return "redirect:";
    }


    @GetMapping("list")
    public String renderList(Model model) {
        model.addAttribute("SiteVisits", SiteVisitData.getAll());
        return "list";
    }

    @GetMapping("/display/{id}")
    public String renderVisit(@PathVariable("id") int id, Model model) {
        SiteVisitData.getById(id);
        model.addAttribute("date", SiteVisitData.getById(id).getDate());
        return "display";
    }


//    @GetMapping("/home/list")
//    public String renderList(ModelAttribut)

    //could do a delete function here

}
