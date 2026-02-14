package com.ami.joinee_feedbackk.contact.service;

import java.util.ArrayList;

import com.ami.joinee_feedbackk.contact.dto.ContactDto;

public interface ContactService {
ContactDto saveContact(ContactDto cdto);
 ArrayList<ContactDto> getAllContacts();
 ContactDto getContactById(Long id);
}
