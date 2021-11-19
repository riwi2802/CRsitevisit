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
        model.addAttribute("department", SiteVisitData.getById(id).getDepartment());
        model.addAttribute("location", SiteVisitData.getById(id).getLocation());
        model.addAttribute("subLocation", SiteVisitData.getById(id).getSubLocation());
        model.addAttribute("hardware", SiteVisitData.getById(id).isHardware());
        model.addAttribute("software", SiteVisitData.getById(id).isSoftware());
        model.addAttribute("security", SiteVisitData.getById(id).isSecurity());
        model.addAttribute("generalMaintenance", SiteVisitData.getById(id).isGeneralMaintenance());
        model.addAttribute("modNum", SiteVisitData.getById(id).getModNum());
        model.addAttribute("modNum1", SiteVisitData.getById(id).getModNum1());
        model.addAttribute("modNum2", SiteVisitData.getById(id).getModNum2());
        model.addAttribute("modNum3", SiteVisitData.getById(id).getModNum3());
        model.addAttribute("modNum4", SiteVisitData.getById(id).getModNum4());
        model.addAttribute("modNum5", SiteVisitData.getById(id).getModNum5());
        model.addAttribute("modNum6", SiteVisitData.getById(id).getModNum6());
        model.addAttribute("modNum7", SiteVisitData.getById(id).getModNum7());
        model.addAttribute("modNum8", SiteVisitData.getById(id).getModNum8());
        model.addAttribute("modNum9", SiteVisitData.getById(id).getModNum9());
        model.addAttribute("modNum10", SiteVisitData.getById(id).getModNum10());
        model.addAttribute("modNum11", SiteVisitData.getById(id).getModNum11());
        model.addAttribute("modNum12", SiteVisitData.getById(id).getModNum12());
        model.addAttribute("modNum13", SiteVisitData.getById(id).getModNum13());
        model.addAttribute("modNum14", SiteVisitData.getById(id).getModNum14());
        model.addAttribute("room", SiteVisitData.getById(id).getRoom());
        model.addAttribute("room1", SiteVisitData.getById(id).getRoom1());
        model.addAttribute("room2", SiteVisitData.getById(id).getRoom2());
        model.addAttribute("room3", SiteVisitData.getById(id).getRoom3());
        model.addAttribute("room4", SiteVisitData.getById(id).getRoom4());
        model.addAttribute("room5", SiteVisitData.getById(id).getRoom5());
        model.addAttribute("room6", SiteVisitData.getById(id).getRoom6());
        model.addAttribute("room7", SiteVisitData.getById(id).getRoom7());
        model.addAttribute("room8", SiteVisitData.getById(id).getRoom8());
        model.addAttribute("room9", SiteVisitData.getById(id).getRoom9());
        model.addAttribute("room10", SiteVisitData.getById(id).getRoom10());
        model.addAttribute("room11", SiteVisitData.getById(id).getRoom11());
        model.addAttribute("room12", SiteVisitData.getById(id).getRoom12());
        model.addAttribute("room13", SiteVisitData.getById(id).getRoom13());
        model.addAttribute("room14", SiteVisitData.getById(id).getRoom14());
        model.addAttribute("description", SiteVisitData.getById(id).getDescription());
        model.addAttribute("description1", SiteVisitData.getById(id).getDescription1());
        model.addAttribute("description2", SiteVisitData.getById(id).getDescription2());
        model.addAttribute("description3", SiteVisitData.getById(id).getDescription3());
        model.addAttribute("description4", SiteVisitData.getById(id).getDescription4());
        model.addAttribute("description5", SiteVisitData.getById(id).getDescription5());
        model.addAttribute("description6", SiteVisitData.getById(id).getDescription6());
        model.addAttribute("description7", SiteVisitData.getById(id).getDescription7());
        model.addAttribute("description8", SiteVisitData.getById(id).getDescription8());
        model.addAttribute("description9", SiteVisitData.getById(id).getDescription9());
        model.addAttribute("description10", SiteVisitData.getById(id).getDescription10());
        model.addAttribute("description11", SiteVisitData.getById(id).getDescription11());
        model.addAttribute("description12", SiteVisitData.getById(id).getDescription12());
        model.addAttribute("description13", SiteVisitData.getById(id).getDescription13());
        model.addAttribute("description14", SiteVisitData.getById(id).getDescription14());
        model.addAttribute("comments", SiteVisitData.getById(id).getComments());
        model.addAttribute("comments1", SiteVisitData.getById(id).getComments1());
        model.addAttribute("comments2", SiteVisitData.getById(id).getComments2());
        model.addAttribute("comments3", SiteVisitData.getById(id).getComments3());
        model.addAttribute("comments4", SiteVisitData.getById(id).getComments4());
        model.addAttribute("comments5", SiteVisitData.getById(id).getComments5());
        model.addAttribute("comments6", SiteVisitData.getById(id).getComments6());
        model.addAttribute("comments7", SiteVisitData.getById(id).getComments7());
        model.addAttribute("comments8", SiteVisitData.getById(id).getComments8());
        model.addAttribute("comments9", SiteVisitData.getById(id).getComments9());
        model.addAttribute("comments10", SiteVisitData.getById(id).getComments10());
        model.addAttribute("comments11", SiteVisitData.getById(id).getComments11());
        model.addAttribute("comments12", SiteVisitData.getById(id).getComments12());
        model.addAttribute("comments13", SiteVisitData.getById(id).getComments13());
        model.addAttribute("comments14", SiteVisitData.getById(id).getComments14());
        model.addAttribute("action", SiteVisitData.getById(id).getAction());
        model.addAttribute("action1", SiteVisitData.getById(id).getAction1());
        model.addAttribute("action2", SiteVisitData.getById(id).getAction2());
        model.addAttribute("action3", SiteVisitData.getById(id).getAction3());
        model.addAttribute("action4", SiteVisitData.getById(id).getAction4());
        model.addAttribute("action5", SiteVisitData.getById(id).getAction5());
        model.addAttribute("action6", SiteVisitData.getById(id).getAction6());
        model.addAttribute("action7", SiteVisitData.getById(id).getAction7());
        model.addAttribute("action8", SiteVisitData.getById(id).getAction8());
        model.addAttribute("action9", SiteVisitData.getById(id).getAction9());
        model.addAttribute("action10", SiteVisitData.getById(id).getAction10());
        model.addAttribute("action11", SiteVisitData.getById(id).getAction11());
        model.addAttribute("action12", SiteVisitData.getById(id).getAction12());
        model.addAttribute("action13", SiteVisitData.getById(id).getAction13());
        model.addAttribute("action14", SiteVisitData.getById(id).getAction14());





        return "display";
    }

}
