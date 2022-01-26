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
    public User addUser(UserDto userDto) {

        User user = new User(userDto);
        userRepository.saveAndFlush()
    }
}
