package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.domain.security.Role;
import com.example.demo.domain.security.UserRole;
import com.example.demo.service.UserService;
import com.example.demo.utility.SecurityUtility;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
        @Autowired
        private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
       User user1= new User();
       user1.setUsername("admin");
       user1.setPhone("08100575362");
       user1.setPassword(SecurityUtility.passwordEncoder().encode("admin"));
       user1.setEmail("admin@gmail.com");

       Set<UserRole> userRole = new HashSet<>();
       Role role1 = new Role();
       role1.setRoleId(0);
       role1.setName("ROLE_ADMIN");
       userRole.add(new UserRole(user1, role1));
       userService.createUser(user1, userRole);

    }
}
