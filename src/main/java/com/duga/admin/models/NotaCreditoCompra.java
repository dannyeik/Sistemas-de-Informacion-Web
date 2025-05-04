package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "nota_credito_compras")
@Data
public class NotaCreditoCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nota_credito_compra")
    private Long id;

    private int id_compra;
    private int id_proveedor;
    private int id_empleado;
    private int id_sucursal;
    private String observacion;
    private Date fecha;
    private String estado;
    private int id_condicion;
    private String nro_nota_credito;
    private String nro_timbrado;
}