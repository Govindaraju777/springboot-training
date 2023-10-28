package com.mybank.example.training;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mybank.example.training.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
    List<User> findByEmail(String email);
}
