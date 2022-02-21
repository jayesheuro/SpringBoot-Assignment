package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.User;

@Service
public class UserServiceImpl implements UsersService {

	List<User> list;
	
	public UserServiceImpl() {
		list = new ArrayList<>();
		list.add(new User(1,"Jayesh Singh","jayesh@gmail.com","Jaipur, Rajasthan"));
	}
	
	@Override
	public List<User> getUsers() {
		return list;
	}

}
