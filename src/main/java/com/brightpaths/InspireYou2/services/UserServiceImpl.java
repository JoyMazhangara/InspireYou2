package com.brightpaths.InspireYou2.services;

import com.brightpaths.InspireYou2.entities.User;
import com.brightpaths.InspireYou2.models.UserDto;
import com.brightpaths.InspireYou2.repositories.StoryRepository;
import com.brightpaths.InspireYou2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    StoryRepository storyRepository;
    @Autowired
    EntityManager entityManager;

    @Override
    public void addUser(UserDto userDto) {
        User user = new User(userDto);
        userRepository.saveAndFlush(user);
    }


    @Override
    public String login(UserDto userDto) {
        User userLogin1 = userRepository.findByEmail(userDto.getEmail());

        if (userLogin1.getEmail().equals(userDto.getEmail()) && userLogin1.getPassword().equals(userDto.getPassword())) {
            return "user logged in successfully";
        } else {
            return "user log in failed";
        }
    }
}
