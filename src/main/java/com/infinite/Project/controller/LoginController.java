package com.infinite.Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.infinite.Project.pojo.Employee;
import com.infinite.Project.pojo.LoginEmp;
import com.infinite.Project.repository.EmployeeRepoImp;
import com.infinite.Project.repository.IEmployeeRepo;
import com.infinite.Project.service.EmployeeServiceEmp;

@RestController
@CrossOrigin(origins = "http://localhost:3000/") // Allowing requests from the React frontend
@RequestMapping("/api")
public class LoginController {
	
	private EmployeeServiceEmp service;
	
	private IEmployeeRepo repo;

	/*
	 * @PostMapping(value="/login") public ResponseEntity<String> login(@RequestBody
	 * LoginEmp empl) { System.out.print(empl.getEmpid());
	 * System.out.print(empl.getPassword()); return ResponseEntity.ok("success"); }
	 */
	@PostMapping(value = "/login")
	public ResponseEntity<String> login(@RequestBody LoginEmp empl) {
		String email=empl.getEmail();
		String pass=empl.getPassword();
		System.out.print(email);
		System.out.print(pass);
		
//		Employee empobj=repo.findByUserid(id);
//		String emopass=empobj.getPassword();
//		
//		if(empobj!=null)
//		{
//			if(emopass.matches(pass))
//			{
//				return ResponseEntity.ok("success");
//			}
//			else
//			{
//				return (ResponseEntity<String>) ResponseEntity.notFound();
//			}
//		}
		
		//System.out.print(empl.getPassword());
		
		//service.findByUsernameAndPassword(id,pass);
		return ResponseEntity.ok("success");
	}
	

}
