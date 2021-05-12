package com.javabykiran.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.application.dao.SpringDao;
import com.javabykiran.application.entity.Employee;

@Service
public class SpringService {

	@Autowired
	SpringDao dao;
	
	public List<Employee> getAllEmployee() {
		List<Employee> list=	dao.getAllEmployee();
		return list;
	}

	public List<Employee> getAllEmployeeByID(int id) {
		List<Employee> list=	dao.getAllEmployeeByID(id);
		return list;
	}

	public List<Employee> getAllEmployeeByname(String name) {
		List<Employee> list=	dao.getAllEmployeeByname(name);
		return list;
	}

	public List<Employee> getAllEmployeeBystatus(String status) {
		List<Employee> list=	dao.getAllEmployeeBystatus(status);
		return list;
	}

}
