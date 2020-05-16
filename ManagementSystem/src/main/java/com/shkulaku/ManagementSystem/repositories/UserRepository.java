package com.shkulaku.ManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shkulaku.ManagementSystem.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
