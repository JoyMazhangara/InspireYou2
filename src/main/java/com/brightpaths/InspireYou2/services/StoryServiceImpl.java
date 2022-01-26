package com.brightpaths.InspireYou2.services;

import com.brightpaths.InspireYou2.entities.Story;
import com.brightpaths.InspireYou2.models.StoryDto;
import com.brightpaths.InspireYou2.repositories.StoryRepository;
import com.brightpaths.InspireYou2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class StoryServiceImpl implements StoryService{

    @Autowired
    StoryRepository storyRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    EntityManager entityManager;
    @Override
    public void addStory(StoryDto storyDto) {
//        User user = entityManager.createNativeQuery("SELECT * FROM users u WHERE u.user_id=?1").setParameter(1,userId).getFirstResult();
//        storyDto.setUser(user);
        Story story = new Story(storyDto);
        storyRepository.saveAndFlush(story);
    }
}
