package com.example.bibliotheque.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public class ReservationRequest {
    @NotNull
    private Long livreId;

    @NotNull
    private Long userId;

    @NotNull @Future
    private LocalDate dateDebut;

    @NotNull @Future
    private LocalDate dateFin;

    // -------- Getters & Setters --------
    public Long getLivreId()             { return livreId; }
    public void setLivreId(Long livreId) { this.livreId = livreId; }

    public Long getUserId()             { return userId; }
    public void setUserId(Long userId)  { this.userId = userId; }

    public LocalDate getDateDebut()                { return dateDebut; }
    public void setDateDebut(LocalDate dateDebut)  { this.dateDebut = dateDebut; }

    public LocalDate getDateFin()                 { return dateFin; }
    public void setDateFin(LocalDate dateFin)     { this.dateFin = dateFin; }
}
