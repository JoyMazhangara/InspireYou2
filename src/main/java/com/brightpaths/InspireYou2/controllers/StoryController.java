package com.brightpaths.InspireYou2.controllers;

import com.brightpaths.InspireYou2.models.StoryDto;
import com.brightpaths.InspireYou2.services.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/story")
public class StoryController {

    @Autowired
    StoryService storyService;

    @PostMapping
    public String addStory(@RequestBody StoryDto storyDto){
        storyService.addStory(storyDto);
        return "story added successfully";
    };

}
