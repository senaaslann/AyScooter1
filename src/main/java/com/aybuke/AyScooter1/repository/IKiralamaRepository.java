package com.aybuke.AyScooter1.repository;

import com.aybuke.AyScooter1.repository.entity.Kiralama;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKiralamaRepository extends JpaRepository<Kiralama,Long> {



}
