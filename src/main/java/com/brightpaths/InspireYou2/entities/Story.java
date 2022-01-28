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

    public Story(Long id, String title, String story) {
        this.id = id;
        this.title = title;
        this.story = story;
    }

    public Story(StoryDto storyDto) {
        this.title = storyDto.getTitle();
        this.story = storyDto.getStory();

    }

    public Story() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
