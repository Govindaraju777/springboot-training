package com.mybank.example.training.model;

public class User {
    private Long id;
    private String username;
    private String email;

    // Constructors, getters, and setters
    
    public void setUsername(String username) {
		this.username = username;
	}
    public String getUsername() {
		return username;
	}
    public void setId(Long id) {
		this.id = id;
	}
    public Long getId() {
		return id;
	}
    public void setEmail(String email) {
		this.email = email;
	}
    public String getEmail() {
		return email;
	}
}
