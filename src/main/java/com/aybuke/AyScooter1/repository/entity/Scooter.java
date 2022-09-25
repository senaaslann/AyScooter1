package com.aybuke.AyScooter1.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "scooter")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class Scooter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String plaka;

}
