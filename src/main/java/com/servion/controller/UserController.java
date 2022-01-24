package com.servion.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servion.model.UserDto;

@RestController
@RequestMapping("/user")
public class UserController {
	private static int id;
	
private List<UserDto> userDtos=new ArrayList<UserDto>();


@PostMapping("/add")
public UserDto saveUser(@RequestBody UserDto userDto) {
	userDto.setId(++id);
	userDtos.add(userDto);
	return userDto;
}

@GetMapping("/getAll")
public List<UserDto> getAllUser(){
return userDtos;
}

}
