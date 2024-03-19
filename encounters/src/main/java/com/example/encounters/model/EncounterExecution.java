package com.example.encounters.model;

import com.example.encounters.model.enums.EncounterExecutionStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class EncounterExecution {
    @Id
    private String id;
    private String encounterId;
    private long touristId;
    private EncounterExecutionStatus status;
    private LocalDateTime lastActivity;
    private LocalDateTime locationEntryTimestamp;
    private Coordinate lastPosition;
}
