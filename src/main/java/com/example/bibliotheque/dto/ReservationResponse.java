package com.example.bibliotheque.dto;


import java.time.LocalDate;

public class ReservationResponse {
    private Long id;
    private Long livreId;
    private Long userId;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String statut;

    // -------- Getters & Setters --------
    public Long getId()               { return id; }
    public void setId(Long id)        { this.id = id; }

    public Long getLivreId()               { return livreId; }
    public void setLivreId(Long livreId)   { this.livreId = livreId; }

    public Long getUserId()              { return userId; }
    public void setUserId(Long userId)   { this.userId = userId; }

    public LocalDate getDateDebut()                 { return dateDebut; }
    public void setDateDebut(LocalDate dateDebut)   { this.dateDebut = dateDebut; }

    public LocalDate getDateFin()                { return dateFin; }
    public void setDateFin(LocalDate dateFin)    { this.dateFin = dateFin; }

    public String getStatut()            { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
}
