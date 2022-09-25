package com.aybuke.AyScooter1.service;

import com.aybuke.AyScooter1.repository.IUserRepository;
import com.aybuke.AyScooter1.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final IUserRepository repository;

    public User save(User kullanici){
        return repository.save(kullanici);
    }

    public List<User> findAll(){
        return repository.findAll();
    }


}
