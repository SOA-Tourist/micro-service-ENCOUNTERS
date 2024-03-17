package com.example.encounters.controller;

import com.example.encounters.model.Encounter;
import com.example.encounters.service.EncounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/encounters", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class EncounterController {
    @Autowired
    private EncounterService encounterService;

    @GetMapping
    public ResponseEntity<List<Encounter>> getAllCheckpointUnrelated() {
        return  new ResponseEntity<>(encounterService.getAllCheckpointUnrelated(), HttpStatus.OK);
    }

}
