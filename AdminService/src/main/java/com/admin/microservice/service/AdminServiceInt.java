package com.admin.microservice.service;

import com.admin.microservice.entity.Admin;

import java.util.Map;

public interface AdminServiceInt {

   // Map<String,String> getAdminName(Map<String,String> name);
    Admin saveAdminName(Map<String,String> name);

}
