package com.lvkerry.microservicesimpleconsumermovie.user.controller;

import com.lvkerry.microservicesimpleconsumermovie.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Kerry on 18/04/09
 */

@RestController
public class MovieController {
    private final RestTemplate restTemplate;

    @Autowired
    public MovieController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://localhost:8000/" + id, User.class);
    }
}
