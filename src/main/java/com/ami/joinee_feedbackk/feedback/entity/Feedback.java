package com.ami.joinee_feedbackk.feedback.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


@Entity
@Table(name = "feedback_form")
@Data
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    @Column(name = "id")
    private Long id;

    @JsonProperty("first_name")
    @Column(name = "first_name")
    private String firstName;

    @JsonProperty("last_name")
    @Column(name = "last_name")
    private String lastName;

    @JsonProperty("email_id")
    @Column(name = "email_id")
    private String emailId;

    @JsonProperty("qualification")
    @Column(name = "qualification")
    private String qualification;

    @JsonProperty("joining_smooth")
    @Column(name = "joining_smooth")
    private String joiningSmooth; // ENUM('Yes','No')

    @JsonProperty("induction")
    @Column(name = "induction")
    private String induction; // VARCHAR(400)

    @JsonProperty("pantry_condition")
    @Column(name = "pantry_condition")
    private String pantryCondition; // ENUM('Yes','No')

    @JsonProperty("equipment_condition")
    @Column(name = "equipment_condition")
    private String equipmentCondition; // VARCHAR(400)

    @JsonProperty("atmosphere")
    @Column(name = "atmosphere")
    private String atmosphere; // VARCHAR(400)

    @JsonProperty("find_us")
    @Column(name = "find_us")
    private String findUs; // VARCHAR(400)

    @JsonProperty("team_work")
    @Column(name = "team_work")
    private String teamWork; // ENUM('Yes','No')

    @JsonProperty("pass_time")
    @Column(name = "pass_time")
    private String passTime; // VARCHAR(400)

    @JsonProperty("recommendation")
    @Column(name = "recommendation")
    private String recommendation; // ENUM('Not At all','Neutral','Recommend','Highly Recommend')

    @Column(name = "created_at", nullable = false)
    @JsonProperty("createdAt")
    private String createdAt;
}