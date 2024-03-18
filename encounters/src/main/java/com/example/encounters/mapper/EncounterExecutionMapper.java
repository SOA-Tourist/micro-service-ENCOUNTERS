package com.example.encounters.mapper;

import com.example.encounters.DTO.EncounterDto;
import com.example.encounters.DTO.EncounterExecutionDto;
import com.example.encounters.model.Encounter;
import com.example.encounters.model.EncounterExecution;

import java.util.ArrayList;
import java.util.List;

public class EncounterExecutionMapper {
    public static EncounterExecutionDto mapToDto(EncounterExecution encounter) {
        EncounterExecutionDto dto = new EncounterExecutionDto();

        dto.setId(encounter.getId());
        dto.setLastActivity(encounter.getLastActivity());
        dto.setLastPosition(encounter.getLastPosition());
        dto.setStatus(encounter.getStatus());
        dto.setEncounterId(encounter.getEncounterId());
        dto.setTouristId(encounter.getTouristId());
        dto.setLocationEntryTimestamp(encounter.getLocationEntryTimestamp());

        return dto;
    }

    public static EncounterExecution mapToEntity(EncounterExecutionDto dto) {
        EncounterExecution encounter = new EncounterExecution();

        encounter.setId(dto.getId());
        encounter.setLastActivity(dto.getLastActivity());
        encounter.setLastPosition(dto.getLastPosition());
        encounter.setStatus(dto.getStatus());
        encounter.setEncounterId(dto.getEncounterId());
        encounter.setTouristId(dto.getTouristId());
        encounter.setLocationEntryTimestamp(dto.getLocationEntryTimestamp());

        return encounter;
    }

    public static List<EncounterExecutionDto> mapToDtoList(List<EncounterExecution> encounterList) {
        var dtos = new ArrayList<EncounterExecutionDto>();

        for(EncounterExecution en : encounterList) {
            dtos.add(mapToDto(en));
        }

        return dtos;
    }

    public static List<EncounterExecution> mapToEntityList(List<EncounterExecutionDto> encounterDtoList) {
        List<EncounterExecution> encounterList = new ArrayList<>();
        for (EncounterExecutionDto encounter : encounterDtoList) {
            encounterList.add(mapToEntity(encounter));
        }
        return encounterList;
    }
}
