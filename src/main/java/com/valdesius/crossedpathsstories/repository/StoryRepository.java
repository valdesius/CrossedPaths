package com.valdesius.crossedpathsstories.repository;

import com.valdesius.crossedpathsstories.domain.Story;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story, Long> {
}
