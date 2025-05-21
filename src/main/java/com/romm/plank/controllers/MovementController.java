package com.romm.plank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romm.plank.entities.Movement;
import com.romm.plank.services.MovementService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController @RequestMapping("/movement")
public class MovementController {
    
    @Autowired MovementService ms;

    @GetMapping
    public List<Movement> findAll() {
        return ms.findAll();
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Movement movement) {
        ms.create(movement);
        
        return ResponseEntity.ok().build();
    }
    
}
