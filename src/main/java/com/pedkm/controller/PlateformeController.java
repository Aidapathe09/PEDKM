package com.pedkm.controller;

import com.pedkm.entities.Plateforme;
import com.pedkm.service.PlateformeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/plateforme")
public class PlateformeController {

    private final PlateformeService plateformeService;

    @Autowired
    public PlateformeController  (PlateformeService plateformeService) {
        this.plateformeService = plateformeService;
    }


    @GetMapping("/{code}")
    public Optional<Plateforme> getPlateformeByCode(@PathVariable String code) {
        return plateformeService.getPlateformeByCode(code);
    }

    public PlateformeService getPlateformeService() {
        return plateformeService;
    }
}


