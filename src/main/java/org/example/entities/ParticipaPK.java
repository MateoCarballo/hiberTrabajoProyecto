package org.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ParticipaPK {
    @Column(name = "id_evento")
    private int eventoId;
    @Column(name = "id_personaje")
    private int personajeId;
}
