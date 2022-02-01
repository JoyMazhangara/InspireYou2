package com.brightpaths.InspireYou2.models;

import com.brightpaths.InspireYou2.entities.Story;
import com.brightpaths.InspireYou2.entities.User;

public class StoryDto {

    private Long id;
    private UserDto userDto;
    private String title;
    private String story;
    private String imageURL;

    public StoryDto(Long id, UserDto userDto, String title, String story, String imageURL) {
        this.id = id;
        this.userDto = userDto;
        this.title = title;
        this.story = story;
        this.imageURL = imageURL;
    }

    public StoryDto(UserDto userDto, String title, String story, String imageURL) {
        this.userDto = userDto;
        this.title = title;
        this.story = story;
        this.imageURL = imageURL;
    }

    //TODO figure how to flesh out the use of userDto in my layers, shouldn't it pull from the user entity like my UserDto pulls from the story entity to create a copy?
    public StoryDto(Story story) {
        this.id = story.getId();
        UserDto dto = new UserDto();
        dto.setEmail(story.getUser().getEmail());


        this.userDto = dto;
        this.title = story.getTitle();
        this.story = story.getStory();
        this.imageURL = story.getImageURL();
    }

    public StoryDto(String title, String story, String imageURL) {
        this.title = title;
        this.story = story;
        this.imageURL = imageURL;
    }

    public StoryDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
