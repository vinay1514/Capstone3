package com.infinite.Project.service;

import com.infinite.Project.pojo.Employee;

public interface IEmployeeService {
	
	public Employee findByUsernameAndPassword(int userid, String password);

}
