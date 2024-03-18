package com.example.encounters.service;

import com.example.encounters.DTO.EncounterExecutionDto;
import com.example.encounters.repository.EncounterExecutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncounterExecutionService {
    @Autowired
    private EncounterExecutionRepository encounterExecutionRepository;

}
