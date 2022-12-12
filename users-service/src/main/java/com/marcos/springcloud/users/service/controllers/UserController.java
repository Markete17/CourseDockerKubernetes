package com.marcos.springcloud.users.service.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.springcloud.users.service.entities.User;
import com.marcos.springcloud.users.service.services.IUserService;

@RestController
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	private IUserService userService;

	@GetMapping
	public ResponseEntity<List<User>> list() {
		return new ResponseEntity<>(this.userService.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getUser(@PathVariable Long id) {
		Optional<User> user = this.userService.findById(id);
		
		return user.isPresent() ? ResponseEntity.ok(user.get()) : ResponseEntity.notFound().build();
	}
}
