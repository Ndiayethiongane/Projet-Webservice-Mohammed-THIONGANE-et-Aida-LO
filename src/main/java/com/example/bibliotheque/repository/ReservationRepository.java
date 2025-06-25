package com.example.bibliotheque.repository;

import com.example.bibliotheque.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByStatutIn(List<String> statuts);
}