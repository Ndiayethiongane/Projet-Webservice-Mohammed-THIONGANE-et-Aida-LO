package com.example.bibliotheque.service;

import com.example.bibliotheque.entity.Livre;
import java.util.List;

public interface LivreService {
    // CRUD + dispos
    Livre createLivre(Long auteurId, Livre livre);
    List<Livre> getAllLivres();
    List<Livre> findAvailable();

    // ➜ AJOUTE ces signatures
    List<Livre> getLivresByAuteur(Long auteurId);
    Livre updateLivre(Long id, Livre livre);
    void deleteLivre(Long id);
}
