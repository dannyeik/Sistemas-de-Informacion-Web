package com.duga.admin.models;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Table(name = "empleados")
@Data
public class Empleados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Long id;

    @Size(max = 15)
    private String legajo;

    @Column(name = "id_barrio")
    private Integer idBarrio;

    @Column(name = "id_nacionalidad")
    private Integer idNacionalidad;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "id_estado_civil")
    private Integer idEstadoCivil;

    @Size(max = 50)
    private String nombres;

    @Size(max = 50)
    private String apellidos;

    @Size(max = 20)
    @Column(name = "cedula_identidad")
    private String cedula;

    @Column(name = "fecha_nac")
    private Date fechaNacimiento;

    @Size(max = 1)
    private String sexo;

    @Size(max = 1)
    private String estado;

    @Column(name = "fecha_incorporacion")
    private Date fechaIncorporacion;

    @Size(max = 100)
    private String direccion;

    @Size(max = 20)
    private String telefono;

    @Size(max = 50)
    private String email;
}
