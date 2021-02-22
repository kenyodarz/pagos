package com.almacenz1.pagos.services;

import com.almacenz1.pagos.models.FacturaDetalle;
import com.almacenz1.pagos.repositories.FacturaDetalleRepository;
import com.almacenz1.pagos.services.apis.FacturaDestalleServiceAPI;
import com.almacenz1.pagos.shared.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class FacturaDetalleServiceImpl extends GenericServiceImpl<FacturaDetalle, Long>
        implements FacturaDestalleServiceAPI {

    private final FacturaDetalleRepository repository;

    public FacturaDetalleServiceImpl(FacturaDetalleRepository repository) {
        this.repository = repository;
    }

    @Override
    public JpaRepository<FacturaDetalle, Long> getJpaRepository() {
        return this.repository;
    }
}
