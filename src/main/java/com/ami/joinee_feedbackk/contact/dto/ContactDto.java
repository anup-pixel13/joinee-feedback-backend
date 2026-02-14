package com.ami.joinee_feedbackk.contact.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ContactDto {

	private Long cid;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("message")
	private String message;
	
	@JsonProperty("phoneNumber")
	private String phoneNumber;
	
	@JsonProperty("createdAt")
	String createdAt;
}
