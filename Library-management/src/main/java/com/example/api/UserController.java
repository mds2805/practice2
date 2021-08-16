package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;
import com.example.entity.User;
import com.example.repository.UserRepository;

@CrossOrigin(origins = {"*"})
@RestController()
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping(produces= {"application/json"})
	public List<User> getAllUsers(){
		return userRepository.findAll();
		
	}
}
