package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ciudades")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad")
    private Long id;

    @Column(name = "descripcion")
    private String nombre;

    @Column(name = "id_departamento")
    private Integer idDepartamento; // o usar Long si querés mantener consistencia
}
