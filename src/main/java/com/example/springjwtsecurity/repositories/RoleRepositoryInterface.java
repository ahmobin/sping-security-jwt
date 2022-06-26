package com.example.springjwtsecurity.repositories;

import com.example.springjwtsecurity.domains.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepositoryInterface extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
