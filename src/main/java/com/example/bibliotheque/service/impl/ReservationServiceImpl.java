package com.example.bibliotheque.service.impl;

import com.example.bibliotheque.dto.ReservationRequest;
import com.example.bibliotheque.dto.ReservationResponse;
import com.example.bibliotheque.entity.Reservation;
import com.example.bibliotheque.repository.ReservationRepository;
import com.example.bibliotheque.service.ReservationService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public ReservationResponse create(ReservationRequest req) {
        // Exemple de création simple
        Reservation r = new Reservation();
        // Remplir r avec req...
        reservationRepository.save(r);
        return map(r);
    }

    @Override
    public Optional<ReservationResponse> findById(Long id) {
        return reservationRepository.findById(id).map(this::map);
    }

    private ReservationResponse map(Reservation r) {
        ReservationResponse res = new ReservationResponse();
        // Mapper les champs
        res.setId(r.getId());
        res.setLivreId(r.getLivreId());
        res.setUserId(r.getUserId());
        // etc.
        return res;
    }
}
