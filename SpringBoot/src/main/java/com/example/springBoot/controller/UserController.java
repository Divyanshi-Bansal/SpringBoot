package com.example.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBoot.dto.UserDto;
import com.example.springBoot.model.User;
import com.example.springBoot.service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value="/register")
	public ResponseEntity<User> register(@RequestBody UserDto userDto){
		User addedUser = userService.addUser(userDto);
		return new ResponseEntity<User>(addedUser,HttpStatus.OK);
	}
}
