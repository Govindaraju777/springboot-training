package com.mybank.users.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mybank.users.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
    List<User> findByEmail(String email);
}
