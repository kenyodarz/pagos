package com.almacenz1.pagos.repositories;

import com.almacenz1.pagos.models.MaestroConcepto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaestroConceptoRepository extends JpaRepository<MaestroConcepto, Long> {
}
