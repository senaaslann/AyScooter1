package com.aybuke.AyScooter1.repository;

import com.aybuke.AyScooter1.repository.entity.Scooter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IScooterRepository extends JpaRepository<Scooter,Long> {
}
