package com.brightpaths.InspireYou2.services;

import com.brightpaths.InspireYou2.entities.User;
import com.brightpaths.InspireYou2.models.StoryDto;
import com.brightpaths.InspireYou2.models.UserDto;

public interface UserService {

    void addUser(UserDto userDto);

    String login(StoryDto storyDto);
}
