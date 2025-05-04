package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipo_impuesto")
@Data
public class TipoImpuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_impuesto")
    private Long id;

    private String descripcion;

    private Integer tipo;
}
