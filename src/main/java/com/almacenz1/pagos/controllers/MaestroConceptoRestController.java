package com.almacenz1.pagos.controllers;

import com.almacenz1.pagos.models.MaestroConcepto;
import com.almacenz1.pagos.services.apis.MaestroConceptoServiceAPI;
import com.almacenz1.pagos.shared.GenericRestController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/conceptos")
@CrossOrigin({"*"})
@Api(tags = "Maestro Conceptos")
public class MaestroConceptoRestController extends GenericRestController<MaestroConcepto, Long> {

    public MaestroConceptoRestController(MaestroConceptoServiceAPI serviceAPI) {
        super(serviceAPI);
    }
}
