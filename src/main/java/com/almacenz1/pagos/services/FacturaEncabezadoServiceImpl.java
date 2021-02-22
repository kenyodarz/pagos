package com.almacenz1.pagos.services;

import com.almacenz1.pagos.models.FacturaEncabezado;
import com.almacenz1.pagos.repositories.FacturaEncabezadoRepository;
import com.almacenz1.pagos.services.apis.FacturaEncabezadoServiceAPI;
import com.almacenz1.pagos.shared.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class FacturaEncabezadoServiceImpl extends GenericServiceImpl<FacturaEncabezado, Long>
        implements FacturaEncabezadoServiceAPI {

    private final FacturaEncabezadoRepository repository;

    public FacturaEncabezadoServiceImpl(FacturaEncabezadoRepository repository) {
        this.repository = repository;
    }

    @Override
    public JpaRepository<FacturaEncabezado, Long> getJpaRepository() {
        return this.repository;
    }
}
