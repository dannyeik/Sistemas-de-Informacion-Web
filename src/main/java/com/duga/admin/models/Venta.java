package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "ventas")
@Data
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Integer id;

    private Integer id_timbrado;
    private Integer id_sucursal;
    private Integer id_pedido_venta;
    private Integer id_empleado;
    private Integer id_servicio_realizado;
    private Integer id_cliente;
    private Integer id_apertura_cierre;

    private Date fecha;
    private String estado;

    private Integer nro1;
    private Integer nro2;
    private Integer nro3;

    private Integer id_tipo_documento;
    private Integer id_condicion;
    private Integer id_nota_credito;
    private Integer id_nota_debito;

    private String proceso;
}