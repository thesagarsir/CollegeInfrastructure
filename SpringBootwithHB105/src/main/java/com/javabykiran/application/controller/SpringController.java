package com.javabykiran.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javabykiran.application.entity.Employee;
import com.javabykiran.application.service.SpringService;

@RestController
public class SpringController {

	@Autowired
	SpringService service;
	
	@GetMapping("/getallemployees")
	public List<Employee> getAllEmployee() {
		System.out.println("Hello Changes");
		List<Employee> list = service.getAllEmployee();
		return list;
	}
	@GetMapping("/getallemployeebyid/{id}")
	public List<Employee> getAllEmployeeByID(@PathVariable int id) {
		
		List<Employee> list = service.getAllEmployeeByID(id);
		return list;
	}
	@GetMapping("/getallemployeebyname/{name}")
	public List<Employee> getAllEmployeeByname(@PathVariable String name) {
		
		List<Employee> list = service.getAllEmployeeByname(name);
		return list;
	}
	@GetMapping("/getallemployeebystatus/{status}")
	public List<Employee> getAllEmployeeBystatus(@PathVariable String status) {
		
		List<Employee> list = service.getAllEmployeeBystatus(status);
		return list;
	}
}
