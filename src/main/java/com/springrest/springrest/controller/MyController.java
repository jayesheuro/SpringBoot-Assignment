package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.User;
import com.springrest.springrest.services.UserServiceImpl;

@RestController
public class MyController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to spring boot application";
	}
	
	//get users
	@GetMapping("/detail")
	public List<User> getUsers(){
		return this.userService.getUsers();
	}
}
