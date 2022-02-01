package com.brightpaths.InspireYou2.entities;


import com.brightpaths.InspireYou2.models.StoryDto;

import javax.persistence.*;

@Entity
@Table(name = "Stories")
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @Column(nullable = false)
    private String title;

    @Column(length = 255, nullable = false)
    private String story;

    @Column(columnDefinition = "text", nullable = false)  //TODO ensure that this takes in any length for the URL
    private String imageURL;

    public Story(Long id, String title, String story, String imageURL) {
        this.id = id;
        this.title = title;
        this.story = story;
        this.imageURL = imageURL;
    }

    public Story(StoryDto storyDto) {
        this.title = storyDto.getTitle();
        this.story = storyDto.getStory();
        this.imageURL = storyDto.getImageURL();
    }

    public Story() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
