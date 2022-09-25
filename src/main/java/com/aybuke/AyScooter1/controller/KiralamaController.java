package com.aybuke.AyScooter1.controller;

import com.aybuke.AyScooter1.repository.entity.Kiralama;
import com.aybuke.AyScooter1.service.KiralamaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kiralama")

public class KiralamaController {
    private final KiralamaService service;
    @GetMapping("/save")
    public ResponseEntity<Kiralama> save(Long sure,Double ucret,Long birimFiyat){
        Kiralama kirala = Kiralama.builder()
                .sure(sure)
                .birimFiyat(birimFiyat)
                .ucret(ucret)
                .build();

        return ResponseEntity.ok(service.save(kirala));
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<Kiralama>> findAll(){

        return ResponseEntity.ok(service.findAll());
    }


}
