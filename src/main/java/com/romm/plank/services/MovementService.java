package com.romm.plank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romm.plank.entities.Movement;
import com.romm.plank.repositories.MovementRepository;

@Service
public class MovementService {
    
    @Autowired MovementRepository mr;

    public List<Movement> findAll() {
        return mr.findAll();
    }

    public Movement create(Movement m) {
        return mr.save(m);
    }
}
