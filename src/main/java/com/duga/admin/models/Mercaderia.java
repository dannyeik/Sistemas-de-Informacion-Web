package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "mercaderias")
@Data
public class Mercaderia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mercaderia")
    private Long id;

    @Column(name = "id_marca")
    private Integer idMarca;

    @Column(name = "id_tipo_impuesto")
    private Integer idTipoImpuesto;

    @Column(name = "id_procedencia")
    private Integer idProcedencia;

    private String descripcion;

    @Column(name = "afecta_existencia")
    private String afectaExistencia;

    @Column(name = "precio_compra")
    private BigDecimal precioCompra;

    @Column(name = "precio_venta")
    private BigDecimal precioVenta;
}
