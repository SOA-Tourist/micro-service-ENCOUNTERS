package com.example.encounters.controller;

import com.example.encounters.DTO.EncounterDto;
import com.example.encounters.DTO.EncounterStatisticsDto;
import com.example.encounters.model.Encounter;
import com.example.encounters.service.EncounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/encounters", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class EncounterController {
    @Autowired
    private EncounterService encounterService;

    @GetMapping
    public ResponseEntity<List<EncounterDto>> getAllCheckpointUnrelated() {
        return  new ResponseEntity<>(encounterService.getAllCheckpointUnrelated(), HttpStatus.OK);
    }

    @GetMapping("/relate")
    public ResponseEntity<List<EncounterDto>> getAllCheckpointRelated() {
        return new ResponseEntity<>(encounterService.getAllCheckpointRelated(),HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EncounterDto> update(@PathVariable String id, @RequestBody EncounterDto dto) {
        var dtoRet = encounterService.update(dto);
        if(dtoRet == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(dtoRet, HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        return encounterService.delete(id) ? new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<EncounterDto> create(@RequestBody EncounterDto dto) {
        return new ResponseEntity<>(encounterService.create(dto), HttpStatus.OK);
    }

    @GetMapping("/activate")
    public ResponseEntity<List<EncounterDto>> getAllActive() {
        return new ResponseEntity<>(encounterService.getAllActive(), HttpStatus.OK);
    }

    @GetMapping("/statistics/{encounterId}")
    public ResponseEntity<EncounterStatisticsDto> getStatistics(@PathVariable String encounterId) {
        var value = encounterService.getStatistics(encounterId);
        return value != null ? new ResponseEntity<>(value, HttpStatus.OK) : new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}