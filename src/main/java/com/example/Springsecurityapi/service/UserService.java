package com.example.Springsecurityapi.service;

import com.example.Springsecurityapi.dto.UserRegistrationDto;
import com.example.Springsecurityapi.model.User;
import com.example.Springsecurityapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getUsername(),passwordEncoder.encode(registrationDto.getPassword()),registrationDto.getRole());
        return userRepository.save(user);
    }
}
