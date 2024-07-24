package com.valdesius.crossedpathsstories.repository;

import com.valdesius.crossedpathsstories.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
