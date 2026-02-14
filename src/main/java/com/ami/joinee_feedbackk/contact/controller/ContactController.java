package com.ami.joinee_feedbackk.contact.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ami.joinee_feedbackk.contact.dto.ContactDto;
import com.ami.joinee_feedbackk.contact.service.ContactService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/contacts")
@AllArgsConstructor
public class ContactController {
	ContactService contactService;
	
	@PostMapping()
	public ResponseEntity<?> saveContact(@RequestBody ContactDto cdto) {
	try {
		cdto.setCreatedAt(java.time.LocalDateTime.now().toString());
		ContactDto savedContact = contactService.saveContact(cdto);
		return new ResponseEntity<>(savedContact, HttpStatus.CREATED);
	} catch (IllegalArgumentException ex) {
		return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
	}
	}
	@GetMapping()
	public ResponseEntity<ArrayList<ContactDto>> getAllContacts(){
		ArrayList<ContactDto> contactDtos = contactService.getAllContacts();
		return new ResponseEntity<ArrayList<ContactDto>>(contactDtos, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ContactDto> getContactById(@PathVariable Long id){
		ContactDto contactDto = contactService.getContactById(id);
		return new ResponseEntity<ContactDto>(contactDto, HttpStatus.OK);
	}
}
