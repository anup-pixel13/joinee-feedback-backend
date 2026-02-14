package com.ami.joinee_feedbackk.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ami.joinee_feedbackk.admin.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUserName(String userName);
}