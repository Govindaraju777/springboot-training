package com.mybank.example.training.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    private String id;
    private String username;
    private String email;

    // Constructors, getters, and setters
    
    public void setUsername(String username) {
		this.username = username;
	}
    public String getUsername() {
		return username;
	}
    public void setId(String id) {
		this.id = id;
	}
    public String getId() {
		return id;
	}
    public void setEmail(String email) {
		this.email = email;
	}
    public String getEmail() {
		return email;
	}
}
