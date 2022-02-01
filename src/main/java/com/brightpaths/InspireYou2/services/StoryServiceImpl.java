package com.brightpaths.InspireYou2.services;

import com.brightpaths.InspireYou2.entities.Story;
import com.brightpaths.InspireYou2.models.StoryDto;
import com.brightpaths.InspireYou2.repositories.StoryRepository;
import com.brightpaths.InspireYou2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoryServiceImpl implements StoryService{

    @Autowired
    StoryRepository storyRepository;
    @Autowired
    UserRepository userRepository;
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void addStory(StoryDto storyDto) {
        Story story = new Story(storyDto); //TODO I need to add code that checks that the user has an account!
//        story.setUser(userRepository.getById(storyDto.getUser().getid()));
        storyRepository.saveAndFlush(story);
    }

    @Override
    public List<Story> getAllStories() {
//        List<StoryDto> StoriesList = entityManager.createNativeQuery("SELECT  FROM stories s").getResultList();
//        return StoriesList.get(0);
//        return storyRepository.findAll().stream().map(StoryDto::new).collect(Collectors.toList());
        return entityManager.createNativeQuery("SELECT * FROM stories").getResultList();
    }

}
