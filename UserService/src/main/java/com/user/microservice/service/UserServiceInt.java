package com.user.microservice.service;

import com.user.microservice.entity.User;

import java.util.Optional;

public interface UserServiceInt {

    User addUser(User user);

    Optional<User> getUserById(Integer id);
}
