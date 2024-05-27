package com.admin.microservice.controller;

import com.admin.microservice.service.AdminServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminServiceInt service;

//    @GetMapping("/{fullName}")
//    public ResponseEntity<Map<String,String>> getAdminByName(@RequestBody Map<String,String> fullName){
//         return ResponseEntity.ok(service.getAdminName(fullName));
//    }

    @PostMapping
    public ResponseEntity<String> createAdmin(@RequestBody Map<String,String> fullName){
        service.saveAdminName(fullName);
        return ResponseEntity.ok("Admin Saved Successfully");
    }


}
