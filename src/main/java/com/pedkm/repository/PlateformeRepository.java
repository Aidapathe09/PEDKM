package com.pedkm.repository;

import com.pedkm.entities.Plateforme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlateformeRepository
extends JpaRepository<Plateforme, Long> {
    
}
