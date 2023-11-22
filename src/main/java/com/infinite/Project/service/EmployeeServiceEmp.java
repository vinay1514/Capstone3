package com.infinite.Project.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.Project.pojo.Employee;
import com.infinite.Project.repository.EmployeeRepoImp;

@Service
public abstract class EmployeeServiceEmp implements IEmployeeService {

	private EmployeeRepoImp repo;

//	@Transactional
//	@Override
//	public Employee findByUsernameAndPassword(int userid, String password) {
//		return repo.findByUsernameAndPassword(userid, password);
//	}

}
