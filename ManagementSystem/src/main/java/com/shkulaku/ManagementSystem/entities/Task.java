package com.shkulaku.ManagementSystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;


@Entity
public class Task {
	
	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	private String date;
	@NotNull
	private String startTime;
	@NotNull
	private String stopTime;
	@NotNull
	@Lob
	private String descrption;
	
	@ManyToOne
	@JoinColumn(name = "USER_EMAIL")
	private User user;
	
	
	
	public Task() {
		
	}
	

	public Task(String date, String startTime, String stopTime, String descrption) {
		this.date = date;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.descrption = descrption;
	}

	public Task(String date, String startTime, String stopTime, String descrption, User user) {
		this.date = date;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.descrption = descrption;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStopTime() {
		return stopTime;
	}

	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}