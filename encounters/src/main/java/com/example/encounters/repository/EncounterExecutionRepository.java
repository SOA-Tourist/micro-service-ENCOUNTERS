package com.example.encounters.repository;

import com.example.encounters.model.EncounterExecution;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EncounterExecutionRepository extends MongoRepository<EncounterExecution, String> {
    public List<EncounterExecution> findAllByEncounterId(String encounterId);
}
