package com.example.bibliotheque.controller;

import com.example.bibliotheque.model.Auteur;
import com.example.bibliotheque.entity.Livre;

import java.util.List;

public class AuteurAvecLivresDTO {

    private Auteur auteur;
    private List<Livre> livres;

    // Getters and setters

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }
}

