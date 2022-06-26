package com.example.springjwtsecurity;

import com.example.springjwtsecurity.domains.Role;
import com.example.springjwtsecurity.domains.User;
import com.example.springjwtsecurity.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SpringJwtSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJwtSecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService){
        return args -> {
            userService.saveRole(new Role(null, "USER"));
            userService.saveRole(new Role(null, "MANAGER"));
            userService.saveRole(new Role(null, "ADMIN"));
            userService.saveRole(new Role(null, "SUPER_ADMIN"));

            userService.saveUser(new User(null, "John Doe","john","123456", new ArrayList<>()));
            userService.saveUser(new User(null, "Will Smith","smith","123456", new ArrayList<>()));
            userService.saveUser(new User(null, "Jim Carry","jim","123456", new ArrayList<>()));
            userService.saveUser(new User(null, "Arnold Schwarzenegger","arnold","123456", new ArrayList<>()));

            userService.addRoleToUser("john","USER");
            userService.addRoleToUser("john","MANAGER");
            userService.addRoleToUser("john","ADMIN");
            userService.addRoleToUser("john","SUPER_ADMIN");
            userService.addRoleToUser("smith","MANAGER");
            userService.addRoleToUser("jim","ADMIN");
            userService.addRoleToUser("arnold","SUPER_ADMIN");
        };
    }

}
