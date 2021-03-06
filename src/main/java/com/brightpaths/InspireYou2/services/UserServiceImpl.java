package com.brightpaths.InspireYou2.services;

import com.brightpaths.InspireYou2.entities.User;
import com.brightpaths.InspireYou2.models.StoryDto;
import com.brightpaths.InspireYou2.models.UserDto;
import com.brightpaths.InspireYou2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    StoryService storyService;


    @Override
    public void addUser(UserDto userDto) {
        User user = new User(userDto);
        userRepository.saveAndFlush(user);
    }


    @Override
    public String login(StoryDto storyDto) {
        User userLogin1 = userRepository.findByEmail(storyDto.getEmail());

        if (userLogin1.getEmail().equals(storyDto.getEmail()) && userLogin1.getPassword().equals(storyDto.getPassword())) {
            storyService.addStory(storyDto);
            return "http://localhost:8080/story.html";
        } else {
            return "user log in failed";
        }
    }
}
