package com.brightpaths.InspireYou2.services;

import com.brightpaths.InspireYou2.entities.Story;
import com.brightpaths.InspireYou2.entities.User;
import com.brightpaths.InspireYou2.models.StoryDto;
import com.brightpaths.InspireYou2.models.UserDto;
import com.brightpaths.InspireYou2.repositories.StoryRepository;
import com.brightpaths.InspireYou2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
    public List<String> addStory(StoryDto storyDto) {
        List<String> response = new ArrayList<>();
        Story story = new Story(storyDto);
        Optional<User> userExists = Optional.ofNullable(userRepository.findByEmail(storyDto.getEmail()));
        if (userExists.isPresent()) {
            User userValid = userRepository.findByEmail((storyDto.getEmail()));
            story.setUser(userValid);
            storyRepository.saveAndFlush(story);
            response.add("story added successfully");
        } else {
            response.add("email or password was incorrect");
        }
        return  response;
    }

    @Override
    public List<Story> getAllStories() {
//        List<StoryDto> StoriesList = entityManager.createNativeQuery("SELECT  FROM stories s").getResultList();
//        return StoriesList.get(0);
//        return storyRepository.findAll().stream().map(StoryDto::new).collect(Collectors.toList());
        return entityManager.createNativeQuery("SELECT * FROM stories").getResultList();
    }

}
