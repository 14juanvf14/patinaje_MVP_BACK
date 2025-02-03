package com.poc.patinaje.controller;

import com.poc.patinaje.model.Coach;
import com.poc.patinaje.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coaches")
public class CoachController extends UserController<Coach> {
    @Autowired
    public CoachController(CoachService coachService) {
        super(coachService);
    }
}
