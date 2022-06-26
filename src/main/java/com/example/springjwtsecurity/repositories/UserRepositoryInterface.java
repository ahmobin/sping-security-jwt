package com.example.springjwtsecurity.repositories;

import com.example.springjwtsecurity.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInterface extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
