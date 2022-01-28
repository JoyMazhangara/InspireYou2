package com.brightpaths.InspireYou2.controllers;

import com.brightpaths.InspireYou2.models.UserDto;
import com.brightpaths.InspireYou2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping
    public String userLogin(@RequestBody UserDto userDto){
        return userService.login(userDto);

    }
}
