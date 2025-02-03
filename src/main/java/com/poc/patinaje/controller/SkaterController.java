package com.poc.patinaje.controller;

import com.poc.patinaje.model.Skater;
import com.poc.patinaje.service.SkaterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skaters")
public class SkaterController extends UserController<Skater> {

    public SkaterController(SkaterService skaterService) {
        super(skaterService);
    }
}
