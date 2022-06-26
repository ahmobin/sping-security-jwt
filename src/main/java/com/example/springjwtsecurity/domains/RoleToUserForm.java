package com.example.springjwtsecurity.domains;

import lombok.Data;

@Data
public class RoleToUserForm {
    private String userName;
    private String roleName;
}
