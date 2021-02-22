package com.almacenz1.pagos.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "PAGOS_FACTURA")
@Data
public class PagoFactura {

    @Id
    @Column(name = "id_pago_factura")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagoFactura;

    @NotNull
    @OneToOne
    @JoinColumn(name = "id_factura_encabezado")
    private FacturaEncabezado facturaEncabezado;

    @NotNull
    @Column(name = "fecha_pago")
    private LocalDate fechaPago;

    @NotNull
    @Column(name = "valor_pago")
    private Double valorPago;

}
