package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "pedido_compras")
@Data
public class PedidoCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido_compra")
    private Long id;

    @Column(name = "id_proveedor")
    private Integer idProveedor;

    @Column(name = "id_empleado")
    private Integer idEmpleado;

    @Column(name = "id_sucursal")
    private Integer idSucursal;

    @Column(name = "id_condicion")
    private Integer idCondicion;

    private LocalDate fecha;
    private String observacion;
    private String estado;

    // Campos para mostrar nombres en la vista (opcional)
    @Transient private String proveedorNombre;
    @Transient private String empleadoNombre;
    @Transient private String sucursalNombre;
    @Transient private String condicionDescripcion;
}
