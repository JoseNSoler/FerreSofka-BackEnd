package co.com.sofka.ferreteria.service;

import co.com.sofka.ferreteria.models.Inventario;
import co.com.sofka.ferreteria.models.ProductosInventario;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface IinventarioServicio {
    Mono<Inventario> guardarInventario(Inventario inventario);
    Flux<Inventario> mostrarTodos();
    Mono<Optional<ProductosInventario>> mostrarListaProductosPorReferencia(String referenciaNombre);
    ResponseEntity agregarListaProductos(String id, ProductosInventario productosInventario);

}
