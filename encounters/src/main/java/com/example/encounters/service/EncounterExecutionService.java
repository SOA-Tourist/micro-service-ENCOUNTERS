package com.example.encounters.service;

import com.example.encounters.DTO.EncounterExecutionDto;
import com.example.encounters.mapper.EncounterExecutionMapper;
import com.example.encounters.model.Coordinate;
import com.example.encounters.model.EncounterExecution;
import com.example.encounters.model.enums.EncounterExecutionStatus;
import com.example.encounters.repository.EncounterExecutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;

@Service
public class EncounterExecutionService {
    @Autowired
    private EncounterExecutionRepository encounterExecutionRepository;

    public EncounterExecutionDto activate(String  encounterId, Coordinate currentPosition) {
        EncounterExecution en = new EncounterExecution();

        en.setEncounterId(encounterId);
        en.setLastActivity(LocalDateTime.now());
        en.setLocationEntryTimestamp(LocalDateTime.now());
        en.setStatus(EncounterExecutionStatus.Active);
        en.setLastPosition(currentPosition);
        encounterExecutionRepository.save(en);

        return EncounterExecutionMapper.mapToDto(en);
    }

    public EncounterExecutionDto abandon(String  executionId) {
        EncounterExecution en = encounterExecutionRepository.findById(executionId).orElse(null);
        if(en == null) return null;
        en.setStatus(EncounterExecutionStatus.Abandoned);
        encounterExecutionRepository.save(en);
        return EncounterExecutionMapper.mapToDto(en);
    }

    public EncounterExecutionDto completeMiscEnctounter(String executionId) {
        EncounterExecution en = encounterExecutionRepository.findById(executionId).orElse(null);
        if(en == null) return null;
        en.setStatus(EncounterExecutionStatus.Completed);
        encounterExecutionRepository.save(en);
        return EncounterExecutionMapper.mapToDto(en);
    }
}
