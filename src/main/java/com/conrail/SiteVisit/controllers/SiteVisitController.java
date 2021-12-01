package com.conrail.SiteVisit.controllers;


import com.conrail.SiteVisit.data.SiteVisitRepository;
import com.conrail.SiteVisit.models.SiteVisit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.conrail.SiteVisit.data.SiteVisitData;

import static java.lang.Integer.parseInt;


@Controller
@RequestMapping("/home")
public class SiteVisitController {

    @Autowired
    private SiteVisitRepository siteVisitRepository;
    private SiteVisit newVisit;


    @GetMapping
    public String renderHome() {
        return "home";
    }

    @GetMapping("add")
    public String renderForm() {
        return "form";
    }

    @PostMapping("add")
    public String submitVisit(@ModelAttribute SiteVisit newSiteVisit) {
        siteVisitRepository.save(newSiteVisit);
                return "redirect:";
    }


    @GetMapping("list")
    public String renderList(Model model) {
        model.addAttribute("SiteVisits", siteVisitRepository.findAll());
        return "list";
    }

    @PostMapping("/delete/{id}")
    public String processDeleteVisit(@PathVariable("id") int id, Model model) {

        siteVisitRepository.deleteById(id);
        return "redirect:/home/list";
    }

    @RequestMapping(value ="/display/{id}", method = {RequestMethod.GET})
    public String renderVisit(@PathVariable("id") int id, Model model) {

        model.addAttribute("date", siteVisitRepository.findById(id).get().getDate());
        model.addAttribute("department", siteVisitRepository.findById(id).get().getDepartment());
        model.addAttribute("location", siteVisitRepository.findById(id).get().getLocation());
        model.addAttribute("subLocation", siteVisitRepository.findById(id).get().getSubLocation());
        model.addAttribute("hardware", siteVisitRepository.findById(id).get().isHardware());
        model.addAttribute("software", siteVisitRepository.findById(id).get().isSoftware());
        model.addAttribute("security", siteVisitRepository.findById(id).get().isSecurity());
        model.addAttribute("generalMaintenance", siteVisitRepository.findById(id).get().isGeneralMaintenance());
        model.addAttribute("modNum", siteVisitRepository.findById(id).get().getModNum());
        model.addAttribute("modNum1", siteVisitRepository.findById(id).get().getModNum1());
        model.addAttribute("modNum2", siteVisitRepository.findById(id).get().getModNum2());
        model.addAttribute("modNum3", siteVisitRepository.findById(id).get().getModNum3());
        model.addAttribute("modNum4", siteVisitRepository.findById(id).get().getModNum4());
        model.addAttribute("modNum5", siteVisitRepository.findById(id).get().getModNum5());
        model.addAttribute("modNum6", siteVisitRepository.findById(id).get().getModNum6());
        model.addAttribute("modNum7", siteVisitRepository.findById(id).get().getModNum7());
        model.addAttribute("modNum8", siteVisitRepository.findById(id).get().getModNum8());
        model.addAttribute("modNum9", siteVisitRepository.findById(id).get().getModNum9());
        model.addAttribute("modNum10", siteVisitRepository.findById(id).get().getModNum10());
        model.addAttribute("modNum11", siteVisitRepository.findById(id).get().getModNum11());
        model.addAttribute("modNum12", siteVisitRepository.findById(id).get().getModNum12());
        model.addAttribute("modNum13", siteVisitRepository.findById(id).get().getModNum13());
        model.addAttribute("modNum14", siteVisitRepository.findById(id).get().getModNum14());
        model.addAttribute("room", siteVisitRepository.findById(id).get().getRoom());
        model.addAttribute("room1", siteVisitRepository.findById(id).get().getRoom1());
        model.addAttribute("room2", siteVisitRepository.findById(id).get().getRoom2());
        model.addAttribute("room3", siteVisitRepository.findById(id).get().getRoom3());
        model.addAttribute("room4", siteVisitRepository.findById(id).get().getRoom4());
        model.addAttribute("room5", siteVisitRepository.findById(id).get().getRoom5());
        model.addAttribute("room6", siteVisitRepository.findById(id).get().getRoom6());
        model.addAttribute("room7", siteVisitRepository.findById(id).get().getRoom7());
        model.addAttribute("room8", siteVisitRepository.findById(id).get().getRoom8());
        model.addAttribute("room9", siteVisitRepository.findById(id).get().getRoom9());
        model.addAttribute("room10", siteVisitRepository.findById(id).get().getRoom10());
        model.addAttribute("room11", siteVisitRepository.findById(id).get().getRoom11());
        model.addAttribute("room12", siteVisitRepository.findById(id).get().getRoom12());
        model.addAttribute("room13", siteVisitRepository.findById(id).get().getRoom13());
        model.addAttribute("room14", siteVisitRepository.findById(id).get().getRoom14());
        model.addAttribute("description", siteVisitRepository.findById(id).get().getDescription());
        model.addAttribute("description1", siteVisitRepository.findById(id).get().getDescription1());
        model.addAttribute("description2", siteVisitRepository.findById(id).get().getDescription2());
        model.addAttribute("description3", siteVisitRepository.findById(id).get().getDescription3());
        model.addAttribute("description4", siteVisitRepository.findById(id).get().getDescription4());
        model.addAttribute("description5", siteVisitRepository.findById(id).get().getDescription5());
        model.addAttribute("description6", siteVisitRepository.findById(id).get().getDescription6());
        model.addAttribute("description7", siteVisitRepository.findById(id).get().getDescription7());
        model.addAttribute("description8", siteVisitRepository.findById(id).get().getDescription8());
        model.addAttribute("description9", siteVisitRepository.findById(id).get().getDescription9());
        model.addAttribute("description10", siteVisitRepository.findById(id).get().getDescription10());
        model.addAttribute("description11", siteVisitRepository.findById(id).get().getDescription11());
        model.addAttribute("description12", siteVisitRepository.findById(id).get().getDescription12());
        model.addAttribute("description13", siteVisitRepository.findById(id).get().getDescription13());
        model.addAttribute("description14", siteVisitRepository.findById(id).get().getDescription14());
        model.addAttribute("comments", siteVisitRepository.findById(id).get().getComments());
        model.addAttribute("comments1", siteVisitRepository.findById(id).get().getComments1());
        model.addAttribute("comments2", siteVisitRepository.findById(id).get().getComments2());
        model.addAttribute("comments3", siteVisitRepository.findById(id).get().getComments3());
        model.addAttribute("comments4", siteVisitRepository.findById(id).get().getComments4());
        model.addAttribute("comments5", siteVisitRepository.findById(id).get().getComments5());
        model.addAttribute("comments6", siteVisitRepository.findById(id).get().getComments6());
        model.addAttribute("comments7", siteVisitRepository.findById(id).get().getComments7());
        model.addAttribute("comments8", siteVisitRepository.findById(id).get().getComments8());
        model.addAttribute("comments9", siteVisitRepository.findById(id).get().getComments9());
        model.addAttribute("comments10", siteVisitRepository.findById(id).get().getComments10());
        model.addAttribute("comments11", siteVisitRepository.findById(id).get().getComments11());
        model.addAttribute("comments12", siteVisitRepository.findById(id).get().getComments12());
        model.addAttribute("comments13", siteVisitRepository.findById(id).get().getComments13());
        model.addAttribute("comments14", siteVisitRepository.findById(id).get().getComments14());
        model.addAttribute("action", siteVisitRepository.findById(id).get().getAction());
        model.addAttribute("action1", siteVisitRepository.findById(id).get().getAction1());
        model.addAttribute("action2", siteVisitRepository.findById(id).get().getAction2());
        model.addAttribute("action3", siteVisitRepository.findById(id).get().getAction3());
        model.addAttribute("action4", siteVisitRepository.findById(id).get().getAction4());
        model.addAttribute("action5", siteVisitRepository.findById(id).get().getAction5());
        model.addAttribute("action6", siteVisitRepository.findById(id).get().getAction6());
        model.addAttribute("action7", siteVisitRepository.findById(id).get().getAction7());
        model.addAttribute("action8", siteVisitRepository.findById(id).get().getAction8());
        model.addAttribute("action9", siteVisitRepository.findById(id).get().getAction9());
        model.addAttribute("action10", siteVisitRepository.findById(id).get().getAction10());
        model.addAttribute("action11", siteVisitRepository.findById(id).get().getAction11());
        model.addAttribute("action12", siteVisitRepository.findById(id).get().getAction12());
        model.addAttribute("action13", siteVisitRepository.findById(id).get().getAction13());
        model.addAttribute("action14", siteVisitRepository.findById(id).get().getAction14());
        return "display";
    }



    @RequestMapping(value ="/display/{id}", method = {RequestMethod.POST})
    public String updateVisit(@PathVariable("id") int id, @ModelAttribute SiteVisit newVisit) {

        SiteVisit oldVisit = (SiteVisit) siteVisitRepository.findById(id).get();

        oldVisit.setDate(newVisit.getDate());
        oldVisit.setDepartment(newVisit.getDepartment());
        oldVisit.setLocation(newVisit.getLocation());
        oldVisit.setSubLocation(newVisit.getSubLocation());
        oldVisit.setHardware(newVisit.isHardware());
        oldVisit.setSoftware(newVisit.isSoftware());
        oldVisit.setSecurity(newVisit.isSecurity());
        oldVisit.setGeneralMaintenance(newVisit.isGeneralMaintenance());


        oldVisit.setModNum(newVisit.getModNum());
        oldVisit.setModNum1(newVisit.getModNum1());
        oldVisit.setModNum2(newVisit.getModNum2());
        oldVisit.setModNum3(newVisit.getModNum3());
        oldVisit.setModNum4(newVisit.getModNum4());
        oldVisit.setModNum5(newVisit.getModNum5());
        oldVisit.setModNum6(newVisit.getModNum6());
        oldVisit.setModNum7(newVisit.getModNum7());
        oldVisit.setModNum8(newVisit.getModNum8());
        oldVisit.setModNum9(newVisit.getModNum9());
        oldVisit.setModNum10(newVisit.getModNum10());
        oldVisit.setModNum11(newVisit.getModNum11());
        oldVisit.setModNum12(newVisit.getModNum12());
        oldVisit.setModNum13(newVisit.getModNum13());
        oldVisit.setModNum14(newVisit.getModNum14());

        oldVisit.setRoom(newVisit.getRoom());
        oldVisit.setRoom1(newVisit.getRoom1());
        oldVisit.setRoom2(newVisit.getRoom2());
        oldVisit.setRoom3(newVisit.getRoom3());
        oldVisit.setRoom4(newVisit.getRoom4());
        oldVisit.setRoom5(newVisit.getRoom5());
        oldVisit.setRoom6(newVisit.getRoom6());
        oldVisit.setRoom7(newVisit.getRoom7());
        oldVisit.setRoom8(newVisit.getRoom8());
        oldVisit.setRoom9(newVisit.getRoom9());
        oldVisit.setRoom10(newVisit.getRoom10());
        oldVisit.setRoom11(newVisit.getRoom11());
        oldVisit.setRoom12(newVisit.getRoom12());
        oldVisit.setRoom13(newVisit.getRoom13());
        oldVisit.setRoom14(newVisit.getRoom14());

        oldVisit.setDescription(newVisit.getDescription());
        oldVisit.setDescription1(newVisit.getDescription1());
        oldVisit.setDescription2(newVisit.getDescription2());
        oldVisit.setDescription3(newVisit.getDescription3());
        oldVisit.setDescription4(newVisit.getDescription4());
        oldVisit.setDescription5(newVisit.getDescription5());
        oldVisit.setDescription6(newVisit.getDescription6());
        oldVisit.setDescription7(newVisit.getDescription7());
        oldVisit.setDescription8(newVisit.getDescription8());
        oldVisit.setDescription9(newVisit.getDescription9());
        oldVisit.setDescription10(newVisit.getDescription10());
        oldVisit.setDescription11(newVisit.getDescription11());
        oldVisit.setDescription12(newVisit.getDescription12());
        oldVisit.setDescription13(newVisit.getDescription13());
        oldVisit.setDescription14(newVisit.getDescription14());

        oldVisit.setComments(newVisit.getComments());
        oldVisit.setComments1(newVisit.getComments1());
        oldVisit.setComments2(newVisit.getComments2());
        oldVisit.setComments3(newVisit.getComments3());
        oldVisit.setComments4(newVisit.getComments4());
        oldVisit.setComments5(newVisit.getComments5());
        oldVisit.setComments6(newVisit.getComments6());
        oldVisit.setComments7(newVisit.getComments7());
        oldVisit.setComments8(newVisit.getComments8());
        oldVisit.setComments9(newVisit.getComments9());
        oldVisit.setComments10(newVisit.getComments10());
        oldVisit.setComments11(newVisit.getComments11());
        oldVisit.setComments12(newVisit.getComments12());
        oldVisit.setComments13(newVisit.getComments13());
        oldVisit.setComments14(newVisit.getComments14());

        oldVisit.setAction(newVisit.getAction());
        oldVisit.setAction1(newVisit.getAction1());
        oldVisit.setAction2(newVisit.getAction2());
        oldVisit.setAction3(newVisit.getAction3());
        oldVisit.setAction4(newVisit.getAction4());
        oldVisit.setAction5(newVisit.getAction5());
        oldVisit.setAction6(newVisit.getAction6());
        oldVisit.setAction7(newVisit.getAction7());
        oldVisit.setAction8(newVisit.getAction8());
        oldVisit.setAction9(newVisit.getAction9());
        oldVisit.setAction10(newVisit.getAction10());
        oldVisit.setAction11(newVisit.getAction11());
        oldVisit.setAction12(newVisit.getAction12());
        oldVisit.setAction13(newVisit.getAction13());
        oldVisit.setAction14(newVisit.getAction14());



        //get it, set it, save it
        siteVisitRepository.save(oldVisit);


        //THIS WORKS

        return "redirect:/home/display/{id}" ;
    }








}
