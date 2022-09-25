package com.aybuke.AyScooter1.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "kiralama")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Kiralama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long sure;
    Double ucret;
    Long birimFiyat;




}
