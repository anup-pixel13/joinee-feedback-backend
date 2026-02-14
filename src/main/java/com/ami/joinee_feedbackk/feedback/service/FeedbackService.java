package com.ami.joinee_feedbackk.feedback.service;

import java.util.ArrayList;

import com.ami.joinee_feedbackk.feedback.dto.FeedbackDto;
import com.ami.joinee_feedbackk.feedback.entity.Feedback;

public interface FeedbackService {
	FeedbackDto saveFeedback(FeedbackDto fdto);
	ArrayList<FeedbackDto> getAllFeedbacks();
	FeedbackDto getFeedbackById(Long id);
}
