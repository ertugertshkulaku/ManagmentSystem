package com.shkulaku.ManagementSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shkulaku.ManagementSystem.entities.Task;
import com.shkulaku.ManagementSystem.entities.User;

public interface TaskRepository extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user);

}
