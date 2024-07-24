package com.valdesius.crossedpathsstories.repository;

import com.valdesius.crossedpathsstories.domain.Encounter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncounterRepository extends JpaRepository<Encounter, Long> {
}
