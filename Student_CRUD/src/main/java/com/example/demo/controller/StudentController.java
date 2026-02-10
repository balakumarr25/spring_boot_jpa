package com.example.demo.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	
	StudentService stuService;
	
	
	
	public StudentController(StudentService stuService) {
		super();
		this.stuService = stuService;
	}


	@PostMapping("/create")
	String create(@RequestBody Student student) {
		stuService.createStudent(student);
		return "Student is saved";
	}
	
	
	@GetMapping("/get/{roll}")
	Student get(@PathVariable int roll) {
		return stuService.getStudent(roll);
	}

	@GetMapping("/getall")
	List<Student> getAll() {
		return stuService.getAllStudent();
	}
	
	@PutMapping("/update/{roll}")
	String update(@PathVariable int roll,@RequestBody Student student) {
		stuService.updateStudent(student);
		return "student updated";
	}
	
	
	@DeleteMapping("/delete/{roll}")
	String delete(@PathVariable int roll) {
		stuService.deleteStudent(roll);
		return "Student deleted";
	}
}
