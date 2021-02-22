package com.almacenz1.pagos.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "FACTURA_ENCABEZADO")
@Data
public class FacturaEncabezado {

    @Id
    @Column(name = "id_factura_encabezado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_factura_encabezado;

    @NotNull
    @Column(name = "fecha_factura")
    private LocalDate fecha_factura;

    @NotNull
    @Column(name = "valor_factura")
    private Double valor_factura;

    @NotNull
    @Column(name = "saldo_factura")
    private Double saldo_factura;

}
