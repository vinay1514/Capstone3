package com.infinite.Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.infinite.Project.pojo.Employee;
import com.infinite.Project.pojo.LoginEmp;
import com.infinite.Project.pojo.LoginMessage;
import com.infinite.Project.repository.EmployeeRepoImp;
import com.infinite.Project.repository.IEmployeeRepo;
import com.infinite.Project.service.EmployeeServiceEmp;

@RestController
@CrossOrigin(origins = "http://localhost:3000/") // Allowing requests from the React frontend
@RequestMapping("/api")
public class LoginController {
	// @Autowired
	// private EmployeeServiceEmp service;
    @Autowired
	private EmployeeRepoImp repo;

	/*
	 * @PostMapping(value="/login") public ResponseEntity<String> login(@RequestBody
	 * LoginEmp empl) { System.out.print(empl.getEmpid());
	 * System.out.print(empl.getPassword()); return ResponseEntity.ok("success"); }
	 */
	@PostMapping(value = "/login")
	public LoginMessage login(@RequestBody LoginEmp loginFront) {
		System.out.println(loginFront.getEmail());
		System.out.println(loginFront.getPassword());
		try {
			String e = repo.findByEmail(loginFront.getEmail());

			String p = repo.findByPassword(loginFront.getPassword());
			System.out.println(e + " " + p);
		} catch (Exception e) {
			System.out.print(e.getCause());
		}
		/*
		 * String email = repo.findByEmail(loginFront.getEmail()); if (email != null) {
		 * String password = loginFront.getPassword(); //String userpass =
		 * email.getPassword(); if (password.matches(password)) { return new
		 * LoginMessage("Login Success", true); } else { return new
		 * LoginMessage("Incorrect emailId or Password", false); } } else { return new
		 * LoginMessage("emailId not exist", false); }
		 */
		return new LoginMessage("Login Success", true);
	}

}
