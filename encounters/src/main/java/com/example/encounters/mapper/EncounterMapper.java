package com.example.encounters.mapper;

import com.example.encounters.DTO.EncounterDto;
import com.example.encounters.model.Encounter;

import java.util.ArrayList;
import java.util.List;


public class EncounterMapper {

    public static EncounterDto mapToDto(Encounter encounter) {
        EncounterDto dto = new EncounterDto();
        dto.setId(encounter.getId());
        dto.setName(encounter.getName());
        dto.setDescription(encounter.getDescription());
        dto.setXp(encounter.getXp());
        dto.setCoordinates(encounter.getCoordinates());
        dto.setStatus(encounter.getStatus());
        dto.setType(encounter.getType());
        dto.setRange(encounter.getRange());
        dto.setImageUrl(encounter.getImageUrl());
        dto.setMiscEncounterTask(encounter.getMiscEncounterTask());
        dto.setSocialEncounterRequiredPeople(encounter.getSocialEncounterRequiredPeople());
        dto.setCheckpointId(encounter.getCheckpointId());
        dto.setIsRequired(encounter.getIsRequired());
        return dto;
    }

    public static Encounter mapToEntity(EncounterDto dto) {
        Encounter encounter = new Encounter();
        encounter.setId(dto.getId());
        encounter.setName(dto.getName());
        encounter.setDescription(dto.getDescription());
        encounter.setXp(dto.getXp());
        encounter.setStatus(dto.getStatus());
        encounter.setType(dto.getType());
        encounter.setCoordinates(dto.getCoordinates());
        encounter.setRange(dto.getRange());
        encounter.setImageUrl(dto.getImageUrl());
        encounter.setMiscEncounterTask(dto.getMiscEncounterTask());
        encounter.setSocialEncounterRequiredPeople(dto.getSocialEncounterRequiredPeople());
        encounter.setCheckpointId(dto.getCheckpointId());
        encounter.setIsRequired(dto.getIsRequired());
        return encounter;
    }

    public static List<EncounterDto> mapToDtoList(List<Encounter> encounterList) {
        var dtos = new ArrayList<EncounterDto>();

        for(Encounter en : encounterList) {
            dtos.add(mapToDto(en));
        }

        return dtos;
    }

    public static List<Encounter> mapToEntityList(List<EncounterDto> encounterDtoList) {
        List<Encounter> encounterList = new ArrayList<>();
        for (EncounterDto encounter : encounterDtoList) {
            encounterList.add(mapToEntity(encounter));
        }
        return encounterList;
    }

}
