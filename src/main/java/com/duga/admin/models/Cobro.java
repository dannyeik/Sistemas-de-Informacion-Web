package com.duga.admin.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "cobros")
@Data
public class Cobro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cobro")
    private Long id;

    private int id_venta;
    private int id_tipo_pago;
    private int id_banco;
    private String banco;
    private String nro_comprobante;
    private Date fecha_cobro_cheque;
    private int monto;
    private int tc;
    private String seleccionado;
    private int id_apertura_cierre;
    private Date fecha_cheque;
}