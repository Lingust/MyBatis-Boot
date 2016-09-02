package com.example.dao;

import org.springframework.stereotype.Repository;

import com.example.domain.User;

@Repository
public interface UserDao {
	
	public User getUserByName(String username);
	public void insertUser(User user);

}
