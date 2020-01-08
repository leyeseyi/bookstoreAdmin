/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.domain.security.UserRole;
import java.util.Set;

/**
 *
 * @author Leyeseyi
 */
public interface UserService {
   
    User createUser(User user, Set<UserRole> userRoles);
    
    User save(User user);
    
}
