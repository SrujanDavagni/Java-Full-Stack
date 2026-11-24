package com.bikeassist.backend.controller;

import com.bikeassist.backend.model.Mechanic;
import com.bikeassist.backend.repository.MechanicRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
@RequestMapping("/api/mechanics")
public class MechanicController {
    private final MechanicRepository mechanicRepository;
    public MechanicController(MechanicRepository mechanicRepository) {
        this.mechanicRepository = mechanicRepository;
    }

    @PostMapping
    public Mechanic registerMechanic(@RequestBody Mechanic mechanic) {
        return mechanicRepository.save(mechanic);
    }
    
    @GetMapping
    public List<Mechanic> getAllMechanics() {
        return mechanicRepository.findAll();
    }
}
