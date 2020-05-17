package com.shkulaku.ManagementSystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.shkulaku.ManagementSystem.entities.Role;
import com.shkulaku.ManagementSystem.entities.User;
import com.shkulaku.ManagementSystem.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;


	public void createUser(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		Role userRole = new Role("USER");
		List<Role> roles = new ArrayList<>();
		roles.add(userRole);
		user.setRoles(roles);
		userRepository.save(user);



	}
	public void createAdmnin(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		Role userRole = new Role("ADMIN");
		List<Role> roles = new ArrayList<>();
		roles.add(userRole);
		user.setRoles(roles);
		userRepository.save(user);

	}
	public User findOne(String email) {
		/*
		 * User u = null; List<User> userList = userRepository.findAll(); if(userList
		 * !=null && userList.size()>0) { for (Iterator iterator = userList.iterator();
		 * iterator.hasNext();) { User user = (User) iterator.next(); if
		 * (user.getEmail().equals(email)) { u = user; break;
		 * 
		 * } } }
		 */
		User  u = userRepository.findByEmail(email);
		return u;
	}
	public boolean isUserPresent(String email) {
		User u = this.findOne(email);
		if(u != null) {
			return true;
		}
			return false;
		
	}
	public List<User> findAll() {
		return userRepository.findAll();
	}
	public List<User> findByName(String name) {
		return userRepository.findByNameLike("%"+name+"%");
	}
}