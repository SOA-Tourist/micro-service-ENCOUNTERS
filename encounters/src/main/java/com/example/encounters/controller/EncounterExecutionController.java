package com.example.encounters.controller;

import com.example.encounters.DTO.EncounterExecutionDto;
import com.example.encounters.model.Coordinate;
import com.example.encounters.service.EncounterExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/encounter/executions", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class EncounterExecutionController {
    @Autowired
    private EncounterExecutionService encounterExecutionService;


    @PostMapping("/{encounterId}")
    public ResponseEntity<EncounterExecutionDto> activate(@PathVariable String  encounterId, @RequestBody Coordinate currentPosition) {
        return new ResponseEntity<>(encounterExecutionService.activate(encounterId, currentPosition), HttpStatus.OK);
    }

    @PatchMapping("/{executionId}")
    public ResponseEntity<EncounterExecutionDto> abandon(@PathVariable String  executionId) {
        EncounterExecutionDto dto = encounterExecutionService.abandon(executionId);
        return dto != null ? new ResponseEntity<>(dto, HttpStatus.OK) : new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PatchMapping("/completeMiscEncounter/{executionId}")
    public ResponseEntity<EncounterExecutionDto> completeMiscEnctounter(@PathVariable String  executionId) {
        EncounterExecutionDto dto = encounterExecutionService.completeMiscEnctounter(executionId);
        return dto != null ? new ResponseEntity<>(dto, HttpStatus.OK) : new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

}
