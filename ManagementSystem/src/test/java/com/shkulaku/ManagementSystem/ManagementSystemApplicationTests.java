package com.shkulaku.ManagementSystem;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shkulaku.ManagementSystem.entities.Task;
import com.shkulaku.ManagementSystem.entities.User;
import com.shkulaku.ManagementSystem.services.TaskService;
import com.shkulaku.ManagementSystem.services.UserService;

@SpringBootTest
class ManagementSystemApplicationTests {

	
	@Autowired
    private UserService userService;
    @Autowired
    private TaskService taskService;
     
    @Before(value = "")
    public void initDb() {
  	  {
  		  User newUser = new User("testUser@mail.com", "testUser", "123456");
  		  userService.createUser(newUser); 
  	  }
  	  {
  		  User newUser = new User("testAdmin@mail.com", "testAdmin", "123456");
  		  userService.createUser(newUser); 
  	  }
  	  
  	  Task userTask = new Task("03/01/2018", "00:11", "11:00", "You need to work today");
  	  User user = userService.findOne("testUser@mail.com");
  	  taskService.addTask(userTask, user);  
    }
	 
    @Test
    public void testUser() {
  	  User user = userService.findOne("testUser@mail.com");
        assertNotNull(user);
  	  User admin = userService.findOne("testAdmin@mail.com");
  	  assertEquals(admin.getEmail(),"testAdmin@mail.com");
    }
    
    @Test
    public void testTask() {
  	  User user = userService.findOne("testUser@mail.com");
  	  List<Task> task = taskService.findUserTask(user);
  	  assertNotNull(task); 

    }
    
    
    

}
