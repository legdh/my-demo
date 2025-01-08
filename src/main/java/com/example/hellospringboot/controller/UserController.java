package com.example.hellospringboot.controller;

import com.example.hellospringboot.entity.User;
import com.example.hellospringboot.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String list() throws JsonProcessingException {
        List<User> users = userService.list();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(users);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody User user) {
        return userService.save(user);
    }
}