package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table 
public class Student {
	
	@Id
	int roll;
	
	@Column
	String name;
	
	@Column
	int age;
	
	@Column
	String email;
	
	public Student(int roll, String name, int age, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	
	public Student() {
		super();
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
