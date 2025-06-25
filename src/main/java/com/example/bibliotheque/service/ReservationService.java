package com.example.bibliotheque.service;

import com.example.bibliotheque.dto.ReservationRequest;
import com.example.bibliotheque.dto.ReservationResponse;
import java.util.Optional;

/** Interface service Réservation */
public interface ReservationService {
    ReservationResponse create(ReservationRequest req);
    Optional<ReservationResponse> findById(Long id);
}
