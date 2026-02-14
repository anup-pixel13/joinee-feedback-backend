package com.ami.joinee_feedbackk.admin.service.impl;

import org.springframework.stereotype.Service;
import com.ami.joinee_feedbackk.admin.entity.Admin;
import com.ami.joinee_feedbackk.admin.repository.AdminRepository;
import com.ami.joinee_feedbackk.admin.service.AdminService;

import lombok.AllArgsConstructor;

@AllArgsConstructor

@Service
public class AdminServiceImpl implements AdminService {

		AdminRepository adminRepository;
		@Override
		public boolean login(String userName, String password) {
		    System.out.println("Login attempt: " + userName + " / " + password);
		    Admin admin = adminRepository.findByUserName(userName);
		    System.out.println("Found admin: " + admin);
		    if (admin == null) {
		        return false;
		    }
		    System.out.println("DB password: " + admin.getPassword());
		    System.out.println(admin.getPassword().equals(password));
		    return admin.getPassword().equals(password);
		}
}

