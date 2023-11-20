package com.mybank.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mybank.users.model.User;
import com.mybank.users.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;

    @GetMapping
    public List<User> getUsers(@RequestParam String email) {
        // Mock Response. You can update to get data from Database or other downstream
//    	List<User> users = new ArrayList<>();
//    	User user1=new User();
//    	user1.setEmail("test");
//    	users.add(user1);
    	
    	
    	List<User> users2 = userService.getUsersByEmail(email);
    	
        return users2;
    }
}
