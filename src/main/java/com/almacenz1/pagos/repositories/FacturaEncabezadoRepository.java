package com.almacenz1.pagos.repositories;

import com.almacenz1.pagos.models.FacturaEncabezado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaEncabezadoRepository extends JpaRepository<FacturaEncabezado, Long> {
}
