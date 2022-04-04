package co.com.sofka.ferreteria.service;

import co.com.sofka.ferreteria.models.MovimientoInventario;
import reactor.core.publisher.Mono;

public interface IMovimientoServicio {
    Mono<MovimientoInventario> crearMovimiento(String idInventario,MovimientoInventario movimiento);
}
