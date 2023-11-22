package com.infinite.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infinite.Project.pojo.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Long> {
	
	public Employee findByUsernameAndPassword(int userid, String password);
}
