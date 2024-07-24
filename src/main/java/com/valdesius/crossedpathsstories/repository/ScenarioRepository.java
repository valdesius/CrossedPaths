package com.valdesius.crossedpathsstories.repository;

import com.valdesius.crossedpathsstories.domain.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScenarioRepository extends JpaRepository<Scenario, Long> {
}
