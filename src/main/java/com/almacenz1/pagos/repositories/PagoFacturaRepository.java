package com.almacenz1.pagos.repositories;

import com.almacenz1.pagos.models.PagoFactura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoFacturaRepository extends JpaRepository<PagoFactura, Long> {
}
