package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "condicion")
@Data
public class CondicionPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_condicion")
    private Long id;

    private String descripcion;
    private Integer cuota;
}
