package com.aybuke.AyScooter1.controller;

import com.aybuke.AyScooter1.repository.entity.User;
import com.aybuke.AyScooter1.service.KiralamaService;
import com.aybuke.AyScooter1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService service;
    @GetMapping("/save")
    public ResponseEntity<User> save(String kullaniciAdi, String password){
        User user = User.builder()
                .kullaniciAdi(kullaniciAdi)
                .password(password)
                .build();
        return ResponseEntity.ok(service.save(user));
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }



}
