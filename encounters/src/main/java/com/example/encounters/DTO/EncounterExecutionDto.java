package com.example.encounters.DTO;

import com.example.encounters.model.Coordinate;
import com.example.encounters.model.enums.EncounterExecutionStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EncounterExecutionDto {
    private String id;
    private long encounterId;
    private long touristId;
    private EncounterExecutionStatus status;
    private LocalDateTime lastActivity;
    private LocalDateTime locationEntryTimestamp;
    private Coordinate lastPosition;
}
