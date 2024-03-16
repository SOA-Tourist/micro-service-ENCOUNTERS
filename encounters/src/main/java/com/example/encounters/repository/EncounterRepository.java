package com.example.encounters.repository;

import com.example.encounters.model.Encounter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  EncounterRepository extends MongoRepository<Encounter, String> {
}
