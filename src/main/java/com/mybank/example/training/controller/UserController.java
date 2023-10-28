package com.mybank.example.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybank.example.training.model.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        // Mock Response. You can update to get data from Database or other downstream
    	List<User> users = new ArrayList<>();
    	User user1=new User();
    	user1.setEmail("test");
    	users.add(user1);
        return users;
    }
}
