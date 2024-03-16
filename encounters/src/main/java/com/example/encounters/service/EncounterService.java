package com.example.encounters.service;

import com.example.encounters.repository.EncounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncounterService {
    @Autowired
    private EncounterRepository encounterRepository;

    

}
