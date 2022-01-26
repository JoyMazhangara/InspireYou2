package com.brightpaths.InspireYou2.models;

import com.brightpaths.InspireYou2.entities.Story;
import com.brightpaths.InspireYou2.entities.User;

public class StoryDto {

    private Long id;
    private User user;
    private String title;
    private String story;

    public StoryDto(Long id, User user, String title, String story) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.story = story;
    }

    public StoryDto(User user, String title, String story) {
        this.user = user;
        this.title = title;
        this.story = story;
    }

    public StoryDto(Story story) {
        this.id = story.getId();
        this.user = story.getUser();
        this.title = story.getTitle();
        this.story = story.getStory();
    }

    public StoryDto(String title, String story) {
        this.title = title;
        this.story = story;
    }

    public StoryDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
}
