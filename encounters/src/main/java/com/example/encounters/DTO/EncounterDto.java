package com.example.encounters.DTO;

import com.example.encounters.model.Coordinate;
import com.example.encounters.model.enums.EncounterStatus;
import com.example.encounters.model.enums.EncounterType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EncounterDto {
    private String Id;
    private String Name;
    private String Description;
    private Coordinate Coordinates;
    private int Xp;
    private EncounterStatus Status;
    private EncounterType Type;
    private int Range;
    private String ImageUrl;
    private String MiscEncounterTask;
    private Integer SocialEncounterRequiredPeople;
    private Long CheckpointId;
    private Boolean IsRequired;
}
