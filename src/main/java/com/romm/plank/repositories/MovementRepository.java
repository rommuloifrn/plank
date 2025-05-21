package com.romm.plank.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romm.plank.entities.Movement;

public interface MovementRepository extends JpaRepository<Movement, UUID> {
    
}
