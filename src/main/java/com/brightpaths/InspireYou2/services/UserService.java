package com.brightpaths.InspireYou2.services;

import com.brightpaths.InspireYou2.entities.User;
import com.brightpaths.InspireYou2.models.UserDto;

public interface UserService {
    User save(User user);

    void addUser(UserDto userDto);
}
