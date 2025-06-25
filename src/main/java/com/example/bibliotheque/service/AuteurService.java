package com.example.bibliotheque.service;

import com.example.bibliotheque.model.Auteur;
import com.example.bibliotheque.repository.AuteurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuteurService {

    private final AuteurRepository auteurRepository;

    public AuteurService(AuteurRepository auteurRepository) {
        this.auteurRepository = auteurRepository;
    }

    public List<Auteur> getAllAuteurs() {
        return auteurRepository.findAll();
    }

    /** Renvoie Optional<Auteur> (permet au contrôleur de décider quoi faire s’il est vide) */
    public Optional<Auteur> findAuteurById(Long id) {
        return auteurRepository.findById(id);
    }

    /** Renvoie directement l’entité ou lève RuntimeException si absente */
    public Auteur getAuteurById(Long id) {
        return auteurRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Auteur non trouvé"));
    }

    public Auteur saveAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public void deleteAuteur(Long id) {
        auteurRepository.deleteById(id);
    }
}
