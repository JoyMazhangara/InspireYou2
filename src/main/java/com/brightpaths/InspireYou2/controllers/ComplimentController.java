package com.brightpaths.InspireYou2.controllers;


import com.brightpaths.InspireYou2.services.ComplimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compliment")
public class ComplimentController {

    @Autowired
    ComplimentService complimentService;

    @GetMapping
    public String getCompliment() {
        return complimentService.randomCompliment();
    }
}
