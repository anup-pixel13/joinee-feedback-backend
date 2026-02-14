package com.ami.joinee_feedbackk.admin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import com.ami.joinee_feedbackk.admin.dto.AdminDto;
import com.ami.joinee_feedbackk.admin.entity.Admin;
import com.ami.joinee_feedbackk.admin.service.AdminService;
import com.ami.joinee_feedbackk.admin.mapper.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/admins")
public class AdminController {
	AdminService adminService;
	
	/* @PostMapping("/login") */
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody AdminDto loginRequest) {
		Admin adminLogin = AdminMapper.mapToAdmin(loginRequest);
		
	    boolean isAuthenticated = adminService.login(adminLogin.getUserName(), adminLogin.getPassword());
	    if (isAuthenticated) {
	    	System.out.println("Login successful for user: " + adminLogin.getUserName());
	        return ResponseEntity.ok("Login successful");
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
	    }
	}
}