package com.almacenz1.pagos.controllers;

import com.almacenz1.pagos.models.FacturaEncabezado;
import com.almacenz1.pagos.services.apis.FacturaEncabezadoServiceAPI;
import com.almacenz1.pagos.shared.GenericRestController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/factura-encabezado")
@CrossOrigin({"*"})
@Api(tags = "Factura Encabezado")
public class FacturaEncabezadoRestController extends GenericRestController<FacturaEncabezado, Long> {

    public FacturaEncabezadoRestController(FacturaEncabezadoServiceAPI serviceAPI) {
        super(serviceAPI);
    }
}
