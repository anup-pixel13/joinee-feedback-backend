package com.ami.joinee_feedbackk.feedback.service.impl;


import java.util.ArrayList;

import org.springframework.stereotype.Service;
import com.ami.joinee_feedbackk.feedback.dto.FeedbackDto;
import com.ami.joinee_feedbackk.feedback.entity.Feedback;
import com.ami.joinee_feedbackk.feedback.mapper.FeedbackMapper;
import com.ami.joinee_feedbackk.feedback.repository.FeedbackRepository;
import com.ami.joinee_feedbackk.feedback.service.FeedbackService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FeedbackServiceImpl implements FeedbackService {
	FeedbackRepository feedbackRepository;
	@Override
	public FeedbackDto saveFeedback(FeedbackDto fdto) {
	    // Map DTO to entity
	    Feedback feedback = FeedbackMapper.mapToFeedback(fdto);

	    // Check if feedback already exists for this email
	    if (feedbackRepository.existsByEmailId(feedback.getEmailId())) {
	        throw new IllegalArgumentException("Feedback already submitted for this email");
	    }

	    // Save if not duplicate
	    Feedback savedFeedback = feedbackRepository.save(feedback);
	    return FeedbackMapper.mapToFeedbackDto(savedFeedback);
	}

	@Override
	public ArrayList<FeedbackDto> getAllFeedbacks() {
		// TODO Auto-generated method stub
		ArrayList<Feedback> feedbacks = (ArrayList<Feedback>) feedbackRepository.findAll();
		ArrayList<FeedbackDto> feedbackDtos = new ArrayList<>();
		for(Feedback feedback : feedbacks) {
			feedbackDtos.add(FeedbackMapper.mapToFeedbackDto(feedback));
		}
		return feedbackDtos;
	}
	@Override
	public FeedbackDto getFeedbackById(Long id) {
		Feedback feedback = feedbackRepository.findById(id).orElseThrow(()-> new RuntimeException("Feedback not found"));
		return FeedbackMapper.mapToFeedbackDto(feedback);
	}
	

}