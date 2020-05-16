package com.shkulaku.ManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shkulaku.ManagementSystem.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
