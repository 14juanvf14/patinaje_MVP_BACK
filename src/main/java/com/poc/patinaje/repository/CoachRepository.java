package com.poc.patinaje.repository;

import com.poc.patinaje.model.Coach;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends UserRepository<Coach> {
}
