package com.brightpaths.InspireYou2.controllers;

import com.brightpaths.InspireYou2.entities.Story;
import com.brightpaths.InspireYou2.models.StoryDto;
import com.brightpaths.InspireYou2.models.UserDto;
import com.brightpaths.InspireYou2.services.StoryService;
import com.brightpaths.InspireYou2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/story")
public class StoryController {

    @Autowired
    StoryService storyService;
    @Autowired
    UserService userService;

    @PostMapping
    public String addStory(@RequestBody StoryDto storyDto){
        return userService.login(storyDto);
    };

    @GetMapping
    public List<Story> displayAllStories() {
        List<Story> stories = storyService.getAllStories();
//        stories.forEach(story -> story.setUserDto(null));
        return stories;
    }

}
