package com.brightpaths.InspireYou2.services;

import com.brightpaths.InspireYou2.entities.Story;
import com.brightpaths.InspireYou2.models.StoryDto;
import com.brightpaths.InspireYou2.models.UserDto;

import java.util.ArrayList;
import java.util.List;


public interface StoryService {
    List<String> addStory(StoryDto storyDto);

    List<Story> getAllStories();
}
