package com.example.bibliotheque.controller;
import com.example.bibliotheque.entity.Livre;
import com.example.bibliotheque.service.LivreService;
import io.swagger.v3.oas.annotations.Operation;      // <-- à importer
import io.swagger.v3.oas.annotations.tags.Tag;       // <-- à importer
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livres")
@Tag(name = "Livres")                                 // (facultatif, pour Swagger)
public class LivreController {

    private final LivreService livreService;

    public LivreController(LivreService livreService) {
        this.livreService = livreService;
    }

    // --------- NOUVEL ENDPOINT DISPONIBLES -------------
    @Operation(summary = "Liste des livres disponibles (non prêtés ni réservés)")
    @GetMapping("/disponibles")
    public List<Livre> disponibles() {
        return livreService.findAvailable();          // <- méthode déjà dans LivreService
    }
    // ---------------------------------------------------

    @PostMapping("/auteur/{auteurId}")
    public Livre createLivre(@PathVariable Long auteurId, @RequestBody Livre livre) {
        return livreService.createLivre(auteurId, livre);
    }


    @GetMapping
    public List<Livre> getAllLivres() {
        return livreService.getAllLivres();
    }

    @GetMapping("/auteur/{auteurId}")
    public List<Livre> getLivresByAuteur(@PathVariable Long auteurId) {
        return livreService.getLivresByAuteur(auteurId);
    }

    @PutMapping("/{id}")
    public Livre updateLivre(@PathVariable Long id, @RequestBody Livre livre) {
        return livreService.updateLivre(id, livre);
    }

    @DeleteMapping("/{id}")
    public void deleteLivre(@PathVariable Long id) {
        livreService.deleteLivre(id);
    }
}
