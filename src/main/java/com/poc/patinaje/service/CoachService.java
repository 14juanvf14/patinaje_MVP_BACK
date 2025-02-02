package com.poc.patinaje.service;

import com.poc.patinaje.model.Coach;
import com.poc.patinaje.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoachService extends UserService<Coach> {
    @Autowired
    public CoachService(CoachRepository coachRepository) {
        super(coachRepository);
    }
}
