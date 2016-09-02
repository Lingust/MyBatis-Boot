package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.domain.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User userService(String username) {
		return userDao.getUserByName(username);
	}

}
