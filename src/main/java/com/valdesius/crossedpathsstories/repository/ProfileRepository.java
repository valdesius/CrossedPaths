package com.valdesius.crossedpathsstories.repository;

import com.valdesius.crossedpathsstories.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
