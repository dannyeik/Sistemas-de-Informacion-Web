package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cajas")
@Data
public class Caja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_caja")
    private Long id;

    private String descripcion;
}
