package com.admin.microservice.service;

import com.admin.microservice.entity.Admin;
import com.admin.microservice.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AdminService implements AdminServiceInt {

    @Autowired
    private AdminRepository repository;
    /**
     * @param name
     * @return
     */
   // @Override
//    public Map<String, String> getAdminName(Map<String,String> name) {
//        Map<String,String> map= new HashMap<>();
//        map.put("firstName",name.get("firstName"));
//        map.put("lastName",name.get("lastName"));
//        return map;
//    }

    /**
     * @param name
     * @return
     */
    @Override
    public Admin saveAdminName(Map<String, String> name) {
        Admin admin= new Admin();
        admin.setFirstName(name.get("firstName"));
        admin.setLastName(name.get("lastName"));
        return repository.save(admin) ;
    }
}
