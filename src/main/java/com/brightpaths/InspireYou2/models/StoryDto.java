package com.brightpaths.InspireYou2.models;

import com.brightpaths.InspireYou2.entities.Story;
import com.brightpaths.InspireYou2.entities.User;

public class StoryDto {

    private Long id;
    private UserDto userDto;
    private String title;
    private String story;
    private String imageURL;
    private String email;
    private String password;

    public StoryDto(Long id, UserDto userDto, String title, String story, String imageURL, String email, String password) {
        this.id = id;
        this.userDto = userDto;
        this.title = title;
        this.story = story;
        this.imageURL = imageURL;
        this.email = email;
        this.password = password;
    }

    public StoryDto(UserDto userDto, String title, String story, String imageURL) {
        this.userDto = userDto;
        this.title = title;
        this.story = story;
        this.imageURL = imageURL;
    }

    //figure how to flesh out the use of userDto in my layers, shouldn't it pull from the user entity like my UserDto pulls from the story entity to create a copy?
    public StoryDto(Story story) {
        this.id = story.getId();
        this.title = story.getTitle();
        this.story = story.getStory();
        this.imageURL = story.getImageURL();
        UserDto dto = new UserDto();
        dto.setEmail(story.getUser().getEmail());
        dto.setStories(story.getUser().getStories());
        dto.setFirstName(story.getUser().getFirstName());
        dto.setLastName(story.getUser().getLastName());
        dto.setId(story.getUser().getid());
        dto.setPassword(story.getUser().getPassword());
        this.userDto = dto;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
