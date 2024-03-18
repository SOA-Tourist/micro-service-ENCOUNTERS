package com.example.encounters.controller;

import com.example.encounters.DTO.EncounterExecutionDto;
import com.example.encounters.service.EncounterExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/encounter/executions", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class EncounterExecutionController {
    @Autowired
    private EncounterExecutionService encounterExecutionService;

}
