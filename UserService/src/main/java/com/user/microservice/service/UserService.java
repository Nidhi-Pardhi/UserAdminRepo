package com.user.microservice.service;

import com.user.microservice.entity.User;
import com.user.microservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserServiceInt {

    @Autowired
    private UserRepository repository;


    /**
     * @param user
     * @return
     */
    @Override
    public User addUser(User user) {
        return repository.save(user);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<User> getUserById(Integer id) {
        return repository.findById(id);
    }
}
