package com.example.bibliotheque.entity;
import com.example.bibliotheque.dto.ReservationResponse;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long livreId;
    private Long userId;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String statut;
    // getters & setters
    public Long getId()        { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getLivreId()              { return livreId; }   // <-- manquait
    public void setLivreId(Long livreId)  { this.livreId = livreId; }

    public Long getUserId()             { return userId; }
    public void setUserId(Long userId)  { this.userId = userId; }

    public LocalDate getDateDebut()                   { return dateDebut; }
    public void setDateDebut(LocalDate dateDebut)     { this.dateDebut = dateDebut; }

    public LocalDate getDateFin()                 { return dateFin; }
    public void setDateFin(LocalDate dateFin)     { this.dateFin = dateFin; }

    public String getStatut()            { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

}
