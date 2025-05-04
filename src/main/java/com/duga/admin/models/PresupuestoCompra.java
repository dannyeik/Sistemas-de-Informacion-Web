package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "presupuesto_compras")
@Data
public class PresupuestoCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_presupuesto_compra")
    private Long id;

    @Column(name = "id_pedido_compra")
    private Integer pedidoId;

    @Column(name = "id_proveedor")
    private Integer proveedorId;

    @Column(name = "id_empleado")
    private Integer empleadoId;

    @Column(name = "id_sucursal")
    private Integer sucursalId;

    private String observacion;
    private Date fecha;
    private String estado;

    @Column(name = "id_condicion")
    private Integer condicionId;
}
