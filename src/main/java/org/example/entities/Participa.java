package org.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Participa {
    //Esto es solo tu clave compuesta con datos primitivos (int)
    @EmbeddedId
    private ParticipaPK id;

    @ManyToOne
    @MapsId("eventoId") //Mapea contra el entero que es clave foránea eventoId
    @JoinColumn(name = "id_evento")
    private Evento evento;

    @ManyToOne
    @MapsId("personajeId") //Mapea contra el entero que es clave foránea personajeId
    @JoinColumn(name = "id_personaje")
    private Personaje personaje;

    //Los datos propios de la tabla deben ir fuera del objeto ParticipaPK <id>
    private LocalDate fecha;
    private String rol;
}
