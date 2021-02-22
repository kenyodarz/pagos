--1. la FACTURA_ENCABEZADO 1 tiene un error en su detalle al ingresar el valor_detalle al revés.
UPDATE "FACTURA_DETALLES" SET "valor_detalle"=68000 WHERE  "id_factura_detalle"=1;

--2. teniendo en cuenta que FACTURA_ENCABEZADO 2 es correcto hay 50000 en la tabla PAGOS_FACTURA corregiremos el ultimo pago
UPDATE "PAGOS_FACTURA" SET "valor_pago"='200000' WHERE  "id_pago_factura"=3;

--3. teniendo en cuenta que FACTURA_ENCABEZADO 4 es correcto la sumatoria del detalle hacen falta 10000 actualizaremos el ultimo registro
UPDATE "FACTURA_DETALLES" SET "valor_detalle"=210000 WHERE  "id_factura_detalle"=10;
