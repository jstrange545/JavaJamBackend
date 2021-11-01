package com.example.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="APPLICATION")
public class Application implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="APPLICATION_ID")
	private int id;
	
	@Column(name="APP_NAME")
	private String Name;
	
	@Column(name="EMAIL")
	private String Email;
	
	@Column(name="EXPERIENCE")
	private String Experience;

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public Application(String name, String email, String experience) {
		super();
		Name = name;
		Email = email;
		Experience = experience;
	}
	
	public Application(int id, String name, String email, String experience) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Experience = experience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getExperience() {
		return Experience;
	}

	public void setExperience(String experience) {
		Experience = experience;
	}
	
	

}


