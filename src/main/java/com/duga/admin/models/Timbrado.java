package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "timbrados")
@Data
public class Timbrado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_timbrado")
    private Long id;

    @Column(name = "nro_timbrado")
    private Integer nroTimbrado;

    @Column(name = "nro_desde")
    private Integer nroDesde;

    @Column(name = "nro_hasta")
    private Integer nroHasta;

    private Integer nro1;
    private Integer nro2;
    private Integer nro3;

    @Column(name = "id_tipo_documento")
    private Integer idTipoDocumento;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    private String estado;
}
