package com.example.encounters.model.controller;

import com.example.encounters.service.EncounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/encounters", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class EncounterController {
    @Autowired
    private EncounterService encounterService;

}
