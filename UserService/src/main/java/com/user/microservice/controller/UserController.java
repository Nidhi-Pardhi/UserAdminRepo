package com.user.microservice.controller;

import com.user.microservice.entity.User;
import com.user.microservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable Integer id){
        return ResponseEntity.ok( service.getUserById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<String> addUser(@RequestBody User user){
        service.addUser(user);
        return ResponseEntity.ok("User Saved successfully");
    }



}
