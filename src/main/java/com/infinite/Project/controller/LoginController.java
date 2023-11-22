package com.infinite.Project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.infinite.Project.pojo.LoginEmp;
import com.infinite.Project.service.EmployeeServiceEmp;

@RestController
@CrossOrigin(origins = "http://localhost:3000/") // Allowing requests from the React frontend
@RequestMapping("/api")
public class LoginController {
	
	private EmployeeServiceEmp service;

	/*
	 * @PostMapping(value="/login") public ResponseEntity<String> login(@RequestBody
	 * LoginEmp empl) { System.out.print(empl.getEmpid());
	 * System.out.print(empl.getPassword()); return ResponseEntity.ok("success"); }
	 */
	@PostMapping(value = "/login")
	public ResponseEntity<String> login(@RequestBody LoginEmp empl) {
		System.out.print(empl.getEmpid());
		System.out.print(empl.getPassword());
		//service.findByUsernameAndPassword(Integer.parseInt(empl.getEmpid()), empl.getPassword());
		return ResponseEntity.ok("success");
	}

}
