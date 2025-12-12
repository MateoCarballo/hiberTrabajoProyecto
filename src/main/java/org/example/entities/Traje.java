package org.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Traje {
    @Id
    private int id;

    @Column(nullable = false, length = 100)
    private String especificacion;

    @OneToOne(mappedBy = "traje")
    private Personaje personaje;

}


