package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	
	StudentRepository studRepo;

	public StudentService(StudentRepository studRepo) {
		super();
		this.studRepo = studRepo;
	}
	
	public void createStudent(Student student) {
		studRepo.save(student);
	}
	
	public Student getStudent(int roll) {
		 Student student = studRepo.findById(roll).orElse(null);
		 return student;
	}
	
	public List<Student> getAllStudent() {
		List<Student> list= studRepo.findAll();
		return list;
	}
	
	public void updateStudent(Student student) {
		studRepo.save(student);
	}
	
	public void deleteStudent(int roll) {
		studRepo.deleteById(roll);
	}
}
