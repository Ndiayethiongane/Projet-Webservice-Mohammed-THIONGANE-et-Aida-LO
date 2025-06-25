package com.example.bibliotheque.controller;

import com.example.bibliotheque.model.Auteur;
import org.springframework.http.ResponseEntity;
import com.example.bibliotheque.repository.AuteurRepository;
import org.springframework.web.bind.annotation.*;
import com.example.bibliotheque.service.AuteurService;
import java.util.List;

@RestController
@RequestMapping("/auteurs")
public class AuteurController {

    private final AuteurRepository auteurRepository;

    public AuteurController(AuteurRepository auteurRepository) {
        this.auteurRepository = auteurRepository;
    }

    // ✅ 1. Créer un auteur
    @PostMapping
    public Auteur createAuteur(@RequestBody Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    // ✅ 2. Lister tous les auteurs
    @GetMapping
    public List<Auteur> getAllAuteurs() {
        return auteurRepository.findAll();
    }
    @GetMapping("/{id}")
    public Auteur getAuteurById(@PathVariable Long id) {
        return auteurRepository.findById(id).orElse(null); // Retourne null si l'auteur n'existe pas
    }
    
}
