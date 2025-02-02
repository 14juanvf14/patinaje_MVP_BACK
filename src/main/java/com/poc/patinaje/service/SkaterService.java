package com.poc.patinaje.service;


import com.poc.patinaje.model.Skater;
import com.poc.patinaje.repository.SkaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkaterService extends UserService<Skater> {
    @Autowired
    public SkaterService(SkaterRepository skaterRepository) {
        super(skaterRepository);
    }
}
