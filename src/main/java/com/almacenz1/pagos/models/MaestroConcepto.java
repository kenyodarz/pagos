package com.almacenz1.pagos.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "MAESTRO_CONCEPTOS")
@Data
public class MaestroConcepto {

    @Id
    @Column(name = "id_concepto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_concepto;

    @NotBlank
    @Column(name = "descripcion")
    private String descripcion;


}
