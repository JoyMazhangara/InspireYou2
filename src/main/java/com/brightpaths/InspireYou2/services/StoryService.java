package com.brightpaths.InspireYou2.services;

import com.brightpaths.InspireYou2.entities.Story;
import com.brightpaths.InspireYou2.models.StoryDto;

import java.util.ArrayList;
import java.util.List;


public interface StoryService {
    void addStory(StoryDto storyDto);

    List<Story> getAllStories();
}
