package com.almacenz1.pagos.repositories;

import com.almacenz1.pagos.models.FacturaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaDetalleRepository extends JpaRepository<FacturaDetalle, Long> {
}
