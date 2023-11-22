package com.infinite.Project.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee {
	
	@Id
	@Column(name="emp_id")
	private int empid;
	
	@Column(name="empname")
	private String emp_name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="department")
	private int department;
	
	@Column(name="designation")
	private int designation;
	
	@Column(name="last_login")
	private int last_login;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String password) {
		super();
		this.empid = empid;
		this.password = password;
	}

	public Employee(int empid, String emp_name, String email, String password, int department, int designation,
			int last_login) {
		super();
		this.empid = empid;
		this.emp_name = emp_name;
		this.email = email;
		this.password = password;
		this.department = department;
		this.designation = designation;
		this.last_login = last_login;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getDesignation() {
		return designation;
	}

	public void setDesignation(int designation) {
		this.designation = designation;
	}

	public int getLast_login() {
		return last_login;
	}

	public void setLast_login(int last_login) {
		this.last_login = last_login;
	}
	
	
	
}
