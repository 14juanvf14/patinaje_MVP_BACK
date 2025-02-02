package com.poc.patinaje.repository;

import com.poc.patinaje.model.Skater;
import org.springframework.stereotype.Repository;

@Repository
public interface SkaterRepository extends UserRepository<Skater> {
}
