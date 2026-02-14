package com.ami.joinee_feedbackk.contact.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ami.joinee_feedbackk.contact.dto.ContactDto;
import com.ami.joinee_feedbackk.contact.entity.Contact;
import com.ami.joinee_feedbackk.contact.mapper.ContactDtoMapper;
import com.ami.joinee_feedbackk.contact.repository.ContactRepository;
import com.ami.joinee_feedbackk.contact.service.ContactService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ContactServiceImpl implements ContactService {
	
	ContactRepository contactRepository;

	@Override
	public ContactDto saveContact(ContactDto cdto) {
		Contact contact = ContactDtoMapper.toContact(cdto);
		Contact savedContact = contactRepository.save(contact);
		 return ContactDtoMapper.toContactDto(savedContact);
		// TODO Auto-generated method stub
	}

	@Override
	public ArrayList<ContactDto> getAllContacts() {
		// TODO Auto-generated method stub

		ArrayList<Contact> contacts = (ArrayList<Contact>) contactRepository.findAll();
		ArrayList<ContactDto> contactDtos = new ArrayList<>();
		for(Contact contact : contacts) {
			contactDtos.add(ContactDtoMapper.toContactDto(contact));
		}
		return contactDtos;
	}

	@Override
	public ContactDto getContactById(Long id) {
		// TODO Auto-generated method stub
		Contact contact = contactRepository.findById(id).orElseThrow(()-> new RuntimeException("Contact not found"));
		return ContactDtoMapper.toContactDto(contact);}

}
