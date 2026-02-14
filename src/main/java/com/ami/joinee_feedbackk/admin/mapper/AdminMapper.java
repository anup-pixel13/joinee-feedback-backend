package com.ami.joinee_feedbackk.admin.mapper;

import com.ami.joinee_feedbackk.admin.dto.AdminDto;
import com.ami.joinee_feedbackk.admin.entity.Admin;
public class AdminMapper {
	public static AdminDto mapToAdminDto(Admin admin) {
		if (admin == null) {
			return null;
		}
		
		AdminDto adminDto = new AdminDto();
		adminDto.setId(admin.getId());
		adminDto.setUserName(admin.getUserName());
		adminDto.setPassword(admin.getPassword());
		
		return adminDto;
	}
	public static Admin mapToAdmin(AdminDto adminDto) {
		if (adminDto == null) {
			return null;
		}
		
		Admin admin = new Admin();
		admin.setId(adminDto.getId());
		admin.setUserName(adminDto.getUserName());
		admin.setPassword(adminDto.getPassword());
		
		return admin;
	}
}
