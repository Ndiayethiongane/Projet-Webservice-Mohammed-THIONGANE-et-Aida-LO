package com.example.bibliotheque.repository;

import com.example.bibliotheque.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, Long> {

    // ➜ déjà présent :
    List<Livre> findByAuteurId(Long auteurId);

    // ➜ AJOUTE cette ligne :
    List<Livre> findByIdNotIn(List<Long> ids);
}
