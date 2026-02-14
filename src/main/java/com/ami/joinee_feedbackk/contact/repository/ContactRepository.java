package com.ami.joinee_feedbackk.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ami.joinee_feedbackk.contact.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
