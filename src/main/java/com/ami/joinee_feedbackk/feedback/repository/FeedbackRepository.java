package com.ami.joinee_feedbackk.feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ami.joinee_feedbackk.feedback.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
	boolean existsByEmailId(String emailId);

}
