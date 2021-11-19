package com.example.Springsecurityapi.controller;

import com.example.Springsecurityapi.dto.UserRegistrationDto;
import com.example.Springsecurityapi.model.User;
import com.example.Springsecurityapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("registration")
public class UserRegistrationController {
    @Autowired
    private UserService userService;

    @PostMapping()
    public ResponseEntity<User> saveUser(@RequestBody UserRegistrationDto userregistrationDto){
        return new ResponseEntity<User>(userService.saveUser(userregistrationDto),HttpStatus.CREATED);
    }
}
