 package com.ami.joinee_feedbackk.feedback.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ami.joinee_feedbackk.feedback.dto.FeedbackDto;
import com.ami.joinee_feedbackk.feedback.service.FeedbackService;

import lombok.AllArgsConstructor;


@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@RestController
@RequestMapping("/api/feedbacks")
public class FeedbackController {
		FeedbackService feedbackService;
		
		@PostMapping()
		public ResponseEntity<?> saveFeedback(@RequestBody FeedbackDto fdto) {
		    try {
		    	fdto.setCreatedAt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

		        FeedbackDto savedFeedback = feedbackService.saveFeedback(fdto);
		        return new ResponseEntity<>(savedFeedback, HttpStatus.CREATED);
		    } catch (IllegalArgumentException ex) {
		        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
		    }
		}
		
		@GetMapping()
		public ResponseEntity<ArrayList<FeedbackDto>> getAllFeedbacks(){
			ArrayList<FeedbackDto> feedbackDtos = feedbackService.getAllFeedbacks();
			return new ResponseEntity<ArrayList<FeedbackDto>>(feedbackDtos, HttpStatus.OK);
		}
		@GetMapping("/{id}")
		public ResponseEntity<FeedbackDto> getFeedbackById(@PathVariable Long id){
			FeedbackDto feedbackDto = feedbackService.getFeedbackById(id);
			return new ResponseEntity<FeedbackDto>(feedbackDto, HttpStatus.OK);
		}
}
