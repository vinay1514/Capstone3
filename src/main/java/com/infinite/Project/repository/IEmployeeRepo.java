package com.infinite.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infinite.Project.pojo.Employee;


public interface IEmployeeRepo extends JpaRepository<Employee, Long> {
	
	public Employee findByUserid(int userid);
	
	public String findByEmail(String email);
	
	public String findByPassword(String password);
	
	//public Employee findByUsernameAndPassword(int userid, String password);
}
