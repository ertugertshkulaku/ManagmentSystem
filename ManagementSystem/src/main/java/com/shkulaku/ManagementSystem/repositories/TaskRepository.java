package com.shkulaku.ManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shkulaku.ManagementSystem.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
