package com.example.springjwtsecurity.repository;

import com.example.springjwtsecurity.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepositoryInterface extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
