package com.infinite.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infinite.Project.pojo.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Long> {
	
	public Employee findByUserid(int userid);
	
	public Employee findByEmail(String email);
	
	public Employee findByPassword(String password);
	
	//public Employee findByUsernameAndPassword(int userid, String password);
}
