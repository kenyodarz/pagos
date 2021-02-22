package com.almacenz1.pagos.controllers;

import com.almacenz1.pagos.models.PagoFactura;
import com.almacenz1.pagos.services.apis.PagoFacturaServiceAPI;
import com.almacenz1.pagos.shared.GenericRestController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pagos")
@CrossOrigin({"*"})
@Api(tags = "Pagos Factura")
public class PagoFacturaRestController extends GenericRestController<PagoFactura, Long> {

    private final PagoFacturaServiceAPI serviceAPI;

    public PagoFacturaRestController(PagoFacturaServiceAPI serviceAPI) {
        super(serviceAPI);
        this.serviceAPI = serviceAPI;
    }
}
