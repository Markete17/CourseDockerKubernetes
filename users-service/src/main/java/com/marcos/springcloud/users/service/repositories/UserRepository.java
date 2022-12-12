package com.marcos.springcloud.users.service.repositories;

import org.springframework.data.repository.CrudRepository;

import com.marcos.springcloud.users.service.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
