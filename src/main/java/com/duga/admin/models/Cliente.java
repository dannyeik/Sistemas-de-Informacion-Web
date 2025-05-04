package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id;

    @Column(name = "id_barrio")
    private Integer idBarrio;

    @Column(name = "razon_social")
    private String razonSocial;

    private String ruc;
    private String direccion;
    private String telefono;
    private String email;

    @Column(name = "tipo_cliente")
    private String tipoCliente;
}
