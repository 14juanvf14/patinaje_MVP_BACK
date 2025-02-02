package com.poc.patinaje.repository;

import com.poc.patinaje.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository <T extends User> extends JpaRepository<T, Long> {
}
