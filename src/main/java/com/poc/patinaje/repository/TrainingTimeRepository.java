package com.poc.patinaje.repository;

import com.poc.patinaje.model.TrainingTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingTimeRepository extends JpaRepository<TrainingTime, Integer> {
}
