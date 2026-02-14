package com.ami.joinee_feedbackk.feedback.mapper;

import com.ami.joinee_feedbackk.feedback.dto.FeedbackDto;
import com.ami.joinee_feedbackk.feedback.entity.Feedback;

public class FeedbackMapper {

    // Map DTO → Entity
    public static Feedback mapToFeedback(FeedbackDto dto) {
        if (dto == null) {
            return null;
        }
        Feedback entity = new Feedback();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setEmailId(dto.getEmailId());
        entity.setQualification(dto.getQualification());
        entity.setJoiningSmooth(dto.getJoiningSmooth());
        entity.setInduction(dto.getInduction());
        entity.setPantryCondition(dto.getPantryCondition());
        entity.setEquipmentCondition(dto.getEquipmentCondition());
        entity.setAtmosphere(dto.getAtmosphere());
        entity.setFindUs(dto.getFindUs());
        entity.setTeamWork(dto.getTeamWork());
        entity.setPassTime(dto.getPassTime());
        entity.setRecommendation(dto.getRecommendation());
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }

    // Map Entity → DTO
    public static FeedbackDto mapToFeedbackDto(Feedback entity) {
        if (entity == null) {
            return null;
        }
        FeedbackDto dto = new FeedbackDto();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setEmailId(entity.getEmailId());
        dto.setQualification(entity.getQualification());
        dto.setJoiningSmooth(entity.getJoiningSmooth());
        dto.setInduction(entity.getInduction());
        dto.setPantryCondition(entity.getPantryCondition());
        dto.setEquipmentCondition(entity.getEquipmentCondition());
        dto.setAtmosphere(entity.getAtmosphere());
        dto.setFindUs(entity.getFindUs());
        dto.setTeamWork(entity.getTeamWork());
        dto.setPassTime(entity.getPassTime());
        dto.setRecommendation(entity.getRecommendation());
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }
}