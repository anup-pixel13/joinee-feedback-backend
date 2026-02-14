package com.ami.joinee_feedbackk.contact.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contacts")
@Data

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long cid;
	
	@Column(name = "name", nullable = false)
	@JsonProperty("name")
	private String name;
	
	@Column(name = "email", nullable = false)
	@JsonProperty("email")
	private String email;
	
	@Column(name = "message", nullable = false, length = 1000)
	@JsonProperty("message")
	private String message;
	
	@Column(name = "phone_number", nullable = false)
	@JsonProperty("phoneNumber")
	private String phoneNumber;
	
	@Column(name = "created_at", nullable = false)
	@JsonProperty("createdAt")
	String createdAt;
}
