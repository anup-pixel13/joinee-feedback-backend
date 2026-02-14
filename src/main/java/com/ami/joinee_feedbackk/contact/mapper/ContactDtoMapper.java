package com.ami.joinee_feedbackk.contact.mapper;

import com.ami.joinee_feedbackk.contact.dto.ContactDto;
import com.ami.joinee_feedbackk.contact.entity.Contact;

public class ContactDtoMapper {
	
	public static ContactDto toContactDto(Contact contact) {
		if (contact == null) {
			return null;
		}
		
		return new ContactDto(
				contact.getCid(),
				contact.getName(),
				contact.getEmail(),
				contact.getMessage(),
				contact.getPhoneNumber(),
				contact.getCreatedAt().toString()
				);
	}
	public static Contact toContact(ContactDto contactDto) {
		if (contactDto == null) {
			return null;
		}
		
		return new Contact(
				contactDto.getCid(),
				contactDto.getName(),
				contactDto.getEmail(),
				contactDto.getMessage(),
				contactDto.getPhoneNumber(),
				contactDto.getCreatedAt().toString()
				);
	}
}
