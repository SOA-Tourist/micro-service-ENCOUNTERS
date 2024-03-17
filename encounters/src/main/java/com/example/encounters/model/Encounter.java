package com.example.encounters.model;

import com.example.encounters.model.enums.EncounterStatus;
import com.example.encounters.model.enums.EncounterType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Encounter {
    @Id
    private String id;
    private String name;
    private String description;
    private Coordinate coordinates;
    private int xp;
    private EncounterStatus status;
    private EncounterType type;
    private int range;
    private String imageUrl;
    private String miscEncounterTask;
    private Integer socialEncounterRequiredPeople;
    private Long checkpointId;
    private Boolean isRequired;
}
