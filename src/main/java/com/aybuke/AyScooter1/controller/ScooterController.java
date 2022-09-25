package com.aybuke.AyScooter1.controller;

import com.aybuke.AyScooter1.repository.entity.Scooter;
import com.aybuke.AyScooter1.service.ScooterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/scooter")
public class ScooterController {
    private final ScooterService service;

    @GetMapping("/save")
    public ResponseEntity<Scooter> save(String plaka){
        Scooter scooter = Scooter.builder()
                .plaka(plaka)
                .build();
        return ResponseEntity.ok(service.save(scooter));

    }
    @GetMapping("findAll")
    public ResponseEntity<List<Scooter>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
}
