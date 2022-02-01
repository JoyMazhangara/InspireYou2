package com.brightpaths.InspireYou2.controllers;


import com.brightpaths.InspireYou2.models.UserDto;
import com.brightpaths.InspireYou2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    UserService userService;

    @PostMapping
    public String newUser(@RequestBody UserDto userDto){
        userService.addUser(userDto);
        return "http://localhost:8080/home.html";
    }
}
