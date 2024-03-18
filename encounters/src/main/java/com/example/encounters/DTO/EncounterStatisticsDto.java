package com.example.encounters.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EncounterStatisticsDto {
    private String encounterId;
    private int activeCount;
    private int completedCount;
    private int abandonedCount;
}
