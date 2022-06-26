package com.example.springjwtsecurity.repository;

import com.example.springjwtsecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInterface extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
