package com.lvkerry.microservicesimpleprovideruser.controller;

import com.lvkerry.microservicesimpleprovideruser.enitty.User;
import com.lvkerry.microservicesimpleprovideruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kerry on 18/04/09
 */

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Long id) {
        return userRepository.findOne(id);
    }

}
