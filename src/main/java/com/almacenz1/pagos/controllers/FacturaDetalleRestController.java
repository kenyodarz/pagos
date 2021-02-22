package com.almacenz1.pagos.controllers;

import com.almacenz1.pagos.models.FacturaDetalle;
import com.almacenz1.pagos.services.apis.FacturaDestalleServiceAPI;
import com.almacenz1.pagos.shared.GenericRestController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/factura-detalle")
@CrossOrigin({"*"})
@Api(tags = "Factura Detalle")
public class FacturaDetalleRestController extends GenericRestController<FacturaDetalle, Long> {

    private final FacturaDestalleServiceAPI serviceAPI;

    public FacturaDetalleRestController(FacturaDestalleServiceAPI serviceAPI) {
        super(serviceAPI);
        this.serviceAPI = serviceAPI;
    }
}
