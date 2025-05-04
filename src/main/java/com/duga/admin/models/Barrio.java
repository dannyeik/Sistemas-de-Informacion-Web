package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "barrios")
public class Barrio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barrio")
    private Long id;

    @Column(name = "descripcion")
    private String nombre;

    @Column(name = "id_ciudad")
    private Long idCiudad;
}
