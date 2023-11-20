package com.mybank.users.service;

import java.util.List;

import com.mybank.users.model.User;

public interface UserService {
    User getUserById(String id);
    User getUserByUsername(String username);
    List<User> getUsersByEmail(String email);
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(String id);
}
