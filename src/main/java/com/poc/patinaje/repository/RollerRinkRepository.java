package com.poc.patinaje.repository;

import com.poc.patinaje.model.RollerRink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RollerRinkRepository extends JpaRepository<RollerRink, Long> {
}
