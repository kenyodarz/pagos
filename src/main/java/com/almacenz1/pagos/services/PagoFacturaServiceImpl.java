package com.almacenz1.pagos.services;

import com.almacenz1.pagos.models.PagoFactura;
import com.almacenz1.pagos.repositories.PagoFacturaRepository;
import com.almacenz1.pagos.services.apis.PagoFacturaServiceAPI;
import com.almacenz1.pagos.shared.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PagoFacturaServiceImpl extends GenericServiceImpl<PagoFactura, Long>
        implements PagoFacturaServiceAPI {

    private final PagoFacturaRepository repository;

    public PagoFacturaServiceImpl(PagoFacturaRepository repository) {
        this.repository = repository;
    }

    @Override
    public JpaRepository<PagoFactura, Long> getJpaRepository() {
        return this.repository;
    }
}
