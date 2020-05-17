package com.shkulaku.ManagementSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shkulaku.ManagementSystem.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

	List<User> findByNameLike(String name);
	User findByEmail (String email);

}
