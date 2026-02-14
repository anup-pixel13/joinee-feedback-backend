package com.ami.joinee_feedbackk.feedback.dto;


import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class FeedbackDto {


    private Long id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("email_id")
    private String emailId;

    @JsonProperty("qualification")
    private String qualification;

    @JsonProperty("joining_smooth")
    private String joiningSmooth; // ENUM('Yes','No')

    @JsonProperty("induction")
    private String induction; // VARCHAR(400)

    @JsonProperty("pantry_condition")
    private String pantryCondition; // ENUM('Yes','No')

    @JsonProperty("equipment_condition")
    private String equipmentCondition; // VARCHAR(400)

    @JsonProperty("atmosphere")
    private String atmosphere; // VARCHAR(400)

    @JsonProperty("find_us")
    private String findUs; // VARCHAR(400)

    @JsonProperty("team_work")
    private String teamWork; // ENUM('Yes','No')

    @JsonProperty("pass_time")
    private String passTime; // VARCHAR(400)

    @JsonProperty("recommendation")
    private String recommendation; // ENUM('Not At all','Neutral','Recommend','Highly Recommend')

    @JsonProperty("createdAt")
    private String createdAt;
}
