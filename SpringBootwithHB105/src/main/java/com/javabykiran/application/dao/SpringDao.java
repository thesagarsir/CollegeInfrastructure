package com.javabykiran.application.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.javabykiran.application.configuration.SpringConfiguration;
import com.javabykiran.application.entity.Employee;

@Repository
public class SpringDao {

	SessionFactory sessionFactory = SpringConfiguration.getSession();
	
	public List<Employee> getAllEmployee() {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria  = session.createCriteria(Employee.class);
		List<Employee> emp_List = criteria.list();
		
		return emp_List;
	}

	public List<Employee> getAllEmployeeByID(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria  = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("id", id));
		List<Employee> list = criteria.list();
		return list;
	}

	public List<Employee> getAllEmployeeByname(String name) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria  = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("name", name));
		List<Employee> list = criteria.list();
		return list;
	}

	public List<Employee> getAllEmployeeBystatus(String status) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria  = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("status", status));
		List<Employee> list = criteria.list();
		return list;
	}

}
