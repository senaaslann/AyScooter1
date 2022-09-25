package com.aybuke.AyScooter1.service;

import com.aybuke.AyScooter1.repository.IScooterRepository;
import com.aybuke.AyScooter1.repository.entity.Scooter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service

public class ScooterService {
    private final IScooterRepository repository;
    public Scooter save(Scooter cihaz){
        return repository.save(cihaz);
    }
    public List<Scooter> findAll(){
        return repository.findAll();
    }

}
