package org.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Habilidad {
    @Id
    private int id;
    private String nombre;
    private String descripcion;

    @ManyToMany
    @JoinTable(
            name = "Personaje_Habilidad",
            joinColumns = @JoinColumn(name = "id_habilidad"),
            // Aquí arriba '@JoinColumn' la parte de la misma
            // clase si estuviera en el otro lado <Personaje> debemos poner 'id_personaje'
            inverseJoinColumns = @JoinColumn(name = "id_personaje")
    )
    private List<Personaje> personajes;
}