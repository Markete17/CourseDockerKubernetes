package com.marcos.springcloud.users.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcos.springcloud.users.service.entities.User;
import com.marcos.springcloud.users.service.repositories.UserRepository;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional(readOnly = true)
	public List<User> findAll() {
		return (List<User>) this.userRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<User> findById(Long id) {
		return this.userRepository.findById(id);
	}

	@Override
	@Transactional
	public User save(User user) {
		return this.userRepository.save(user);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		this.userRepository.deleteById(id);
	}
}
