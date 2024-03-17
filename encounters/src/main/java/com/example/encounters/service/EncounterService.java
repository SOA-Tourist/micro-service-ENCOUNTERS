package com.example.encounters.service;

import com.example.encounters.model.Encounter;
import com.example.encounters.repository.EncounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EncounterService {
    @Autowired
    private EncounterRepository encounterRepository;

    public List<Encounter> getAllCheckpointUnrelated() {
        List<Encounter> encounters = new ArrayList<>();
        for(var e : encounterRepository.findAll()) {
            if(e.getCheckpointId() == null) {
                encounters.add(e);
            }
        }
        return encounters;
    }
}
