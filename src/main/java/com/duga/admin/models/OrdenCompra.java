package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "orden_compras")
@Data
public class OrdenCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden_compra")
    private Long id;

    @Column(name = "id_presupuesto_compra")
    private Integer idPresupuesto;

    @Column(name = "id_proveedor")
    private Integer idProveedor;

    @Column(name = "id_empleado")
    private Integer idEmpleado;

    @Column(name = "id_sucursal")
    private Integer idSucursal;

    @Column(name = "observacion")
    private String observacion;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "estado")
    private String estado;

    @Column(name = "id_condicion")
    private Integer idCondicion;
}
