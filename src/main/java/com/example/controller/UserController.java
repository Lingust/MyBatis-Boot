package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	@ResponseBody
	public String userLogin(String username, String password) {
		//√‹¬ÎŒ¥”√
		/*User user = userService.userService(username);
		if(user.getUsername().equals(username)) {
			return user.toString();
		}*/
		return "please Login!";
	}

}
