package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	EmployeeService empServ;
	
	
	public EmployeeController(EmployeeService empServ) {
		super();
		this.empServ = empServ;
	}

	
	@PostMapping("/create")
	public String create(@RequestBody Employee emp) {
		empServ.createEmployee(emp);
		return "Employee is created";
	}
	
	@GetMapping("/get/{empId}")
	public Employee get(@PathVariable int empId) {
		 Employee emp =  empServ.getEmployee(empId);
		 return emp;
	}
	
	@GetMapping("/getall")
	public List<Employee> getAll() {
		 return empServ.getAllEmployee();
	}
	
	@PutMapping("/update")
	public String  update(@RequestBody Employee emp) {
		empServ.updateEmployee(emp);
		return "Updated succesfully";
	}
	
	
	@DeleteMapping("/delete/{empId}")
	public String delete(@PathVariable int empId) {
		empServ.deleteEmployee(empId);
		return "deleted succesfully";
	}
}
