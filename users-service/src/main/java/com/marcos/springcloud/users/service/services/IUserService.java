package com.marcos.springcloud.users.service.services;

import java.util.List;
import java.util.Optional;

import com.marcos.springcloud.users.service.entities.User;

public interface IUserService {
	
	List<User> findAll();
	Optional<User> findById(Long id);
	User save(User user);
	void deleteById(Long id);

}
