package com.example.SprintTaskORM.controllers;

import com.example.SprintTaskORM.models.ApplicationRequest;
import com.example.SprintTaskORM.service.ApplicationRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private ApplicationRequestService appReqService;

    @GetMapping("/")
    public String homePage(Model model){
        List<ApplicationRequest> appRequests = appReqService.getAppRequests();
        model.addAttribute("zayavki", appRequests);
        return "home";
    }

    @PostMapping("/add-request")
    public String addRequest(ApplicationRequest appRequest){
        appReqService.addAppRequest(appRequest);
        return "redirect:/";
    }
    @GetMapping("/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        ApplicationRequest appReq = appReqService.getAppReqById(id);
        model.addAttribute("zayavka", appReq);
        return "details";
    }

}
