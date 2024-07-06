package com.pedkm.service;

import com.pedkm.entities.Plateforme;
import com.pedkm.repository.PlateformeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlateformeService {

    private final PlateformeRepository plateformeRepository;
    public interface PlateformeRepository extends JpaRepository<Plateforme, Long> {
        Optional<Plateforme> findByCode(String code);
    }
    @Autowired
    public PlateformeService(PlateformeRepository plateformeRepository) {
        this.plateformeRepository = plateformeRepository;
    }

    public Optional<Plateforme> getPlateformeByCode(String code) {

        return plateformeRepository.findByCode(code);
    }

}
