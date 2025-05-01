package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "moneda")
public class Moneda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_moneda")
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;

    @Column(name = "valor")
    private String valor;

    @Column(name = "orden")
    private Integer orden;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDenominacion() { return denominacion; }
    public void setDenominacion(String denominacion) { this.denominacion = denominacion; }

    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }

    public Integer getOrden() { return orden; }
    public void setOrden(Integer orden) { this.orden = orden; }
}
