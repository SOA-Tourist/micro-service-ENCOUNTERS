package com.example.encounters.service;

import com.example.encounters.DTO.EncounterDto;
import com.example.encounters.controller.EncounterController;
import com.example.encounters.mapper.EncounterMapper;
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

    public List<EncounterDto> getAllCheckpointUnrelated() {
        List<Encounter> encounters = new ArrayList<>();
        for(var e : encounterRepository.findAll()) {
            if(e.getCheckpointId() == null) {
                encounters.add(e);
            }
        }
        return EncounterMapper.mapToDtoList(encounters);
    }

    public EncounterDto update(EncounterDto dto) {
        Encounter en = EncounterMapper.mapToEntity(dto);
        return encounterRepository.existsById(en.getId()) ? EncounterMapper.mapToDto(encounterRepository.save(en)) : null;
    }

    public boolean delete(String encounterId) {
        Encounter encounter = encounterRepository.findById(encounterId).get();
        encounterRepository.delete(encounter);
        return encounter != null ? true : false;
    }

    public EncounterDto create(EncounterDto dto) {
        Encounter encounter = EncounterMapper.mapToEntity(dto);
        return EncounterMapper.mapToDto(encounterRepository.save(encounter));
    }

    public List<EncounterDto> getAllCheckpointRelated(){
        List<Encounter> encounters = new ArrayList<>();
        for(var e : encounterRepository.findAll()){
            if(e.getCheckpointId() != null){
                encounters.add(e);
            }
        }
        return EncounterMapper.mapToDtoList(encounters);
    }
}
