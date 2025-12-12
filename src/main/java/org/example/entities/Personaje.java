package org.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Personaje {
    @Id
    private int id;
    @NonNull
    private String nombre;
    private String alias;

    @OneToOne
    @JoinColumn(name = "id_traje")
    private Traje traje;

    @OneToMany(mappedBy = "personaje")
    private List<Participa> participaciones;

    @ManyToMany(mappedBy = "personajes")
    private List<Habilidad> habilidades;
}
