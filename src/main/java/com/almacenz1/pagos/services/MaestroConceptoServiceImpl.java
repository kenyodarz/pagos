package com.almacenz1.pagos.services;

import com.almacenz1.pagos.models.MaestroConcepto;
import com.almacenz1.pagos.repositories.MaestroConceptoRepository;
import com.almacenz1.pagos.services.apis.MaestroConceptoServiceAPI;
import com.almacenz1.pagos.shared.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MaestroConceptoServiceImpl extends GenericServiceImpl<MaestroConcepto, Long>
        implements MaestroConceptoServiceAPI {

    private final MaestroConceptoRepository repository;

    public MaestroConceptoServiceImpl(MaestroConceptoRepository repository) {
        this.repository = repository;
    }

    @Override
    public JpaRepository<MaestroConcepto, Long> getJpaRepository() {
        return this.repository;
    }
}
