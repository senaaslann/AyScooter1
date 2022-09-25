package com.aybuke.AyScooter1.service;

import com.aybuke.AyScooter1.repository.IKiralamaRepository;
import com.aybuke.AyScooter1.repository.entity.Kiralama;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;

@RequiredArgsConstructor
@Service
public class KiralamaService {
    private final IKiralamaRepository repository;

    public Kiralama save(Kiralama rent){
        return repository.save(rent);

    }
    public List<Kiralama> findAll(){
        return repository.findAll();

    }

}
