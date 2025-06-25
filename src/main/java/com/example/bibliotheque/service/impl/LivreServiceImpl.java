package com.example.bibliotheque.service.impl;

import com.example.bibliotheque.entity.Livre;
import com.example.bibliotheque.entity.Reservation;
import com.example.bibliotheque.repository.LivreRepository;
import com.example.bibliotheque.repository.ReservationRepository;
import com.example.bibliotheque.service.LivreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreServiceImpl implements LivreService {

    private final LivreRepository livreRepository;
    private final ReservationRepository reservationRepo;

    public LivreServiceImpl(LivreRepository livreRepository,
                            ReservationRepository reservationRepo) {
        this.livreRepository = livreRepository;
        this.reservationRepo = reservationRepo;
    }

    /* ---------- Création ---------- */
    @Override
    public Livre createLivre(Long auteurId, Livre livre) {
        // ici tu peux lier l’auteur si nécessaire
        return livreRepository.save(livre);
    }

    /* ---------- Lecture ---------- */
    @Override
    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    @Override
    public List<Livre> getLivresByAuteur(Long auteurId) {
        return livreRepository.findByAuteurId(auteurId);
    }

    /* ---------- Disponibles ---------- */
    @Override
    public List<Livre> findAvailable() {
        // récupère la liste des IDs déjà prêtés ou réservés
        List<Long> indispoIds = reservationRepo.findByStatutIn(List.of("PRETE", "EN_ATTENTE"))
                .stream()
                .map(Reservation::getLivreId)
                .toList();
        return livreRepository.findByIdNotIn(indispoIds);
    }

    /* ---------- Mise à jour ---------- */
    @Override
    public Livre updateLivre(Long id, Livre updatedLivre) {
        Livre livre = livreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livre non trouvé"));
        livre.setTitre(updatedLivre.getTitre());
        livre.setAnnee(updatedLivre.getAnnee());
        // ajoute d’autres champs si besoin
        return livreRepository.save(livre);
    }

    /* ---------- Suppression ---------- */
    @Override
    public void deleteLivre(Long id) {
        livreRepository.deleteById(id);
    }
}
