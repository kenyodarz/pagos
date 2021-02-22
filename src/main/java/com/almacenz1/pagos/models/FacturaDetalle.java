package com.almacenz1.pagos.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "FACTURA_DETALLES")
@Data
public class FacturaDetalle {

    @Id
    @Column(name = "id_factura_detalle")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_factura_detalles;

    @NotNull
    @OneToOne
    @JoinColumn(name = "id_factura_encabezado")
    private FacturaEncabezado facturaEncabezado;

    @NotNull
    @OneToOne
    @JoinColumn(name = "id_concepto")
    private MaestroConcepto maestroConcepto;

    @Column(name = "valor_detalle")
    private Long valorDetalle;

}
