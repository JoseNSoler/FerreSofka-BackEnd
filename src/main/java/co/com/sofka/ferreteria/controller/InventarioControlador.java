package co.com.sofka.ferreteria.controller;

//import co.com.sofka.ferreteria.mapper.MapperInventario;
import co.com.sofka.ferreteria.models.Inventario;
import co.com.sofka.ferreteria.models.ProductosInventario;
import co.com.sofka.ferreteria.service.impl.InventarioServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RestController
@RequestMapping("/inventario")
public class InventarioControlador {
    @Autowired
    private InventarioServicioImpl inventarioServicio;

    // MapperInventario mapperInventario;

    @GetMapping("/mostrarTodos")
    public Flux<Inventario> mostrarTodos(){
        return inventarioServicio.mostrarTodos();
    }

    @PutMapping("agregarListaProductos/{id}")
    private ResponseEntity agregarListaProductos(@PathVariable("id") String id, @RequestBody ProductosInventario productosInventario){
        return inventarioServicio.agregarListaProductos(id, productosInventario);
    }

    @PostMapping("/guardar")
    public Mono<Inventario> guardar(@RequestBody Inventario inventario){
            return inventarioServicio.guardarInventario(inventario);

    }

    @GetMapping("/productosInventarioPorReferencia/{name}")
    public Mono<Optional<ProductosInventario>> buscarListaPorReferencia(@PathVariable("name") String referencia){
        return inventarioServicio.mostrarListaProductosPorReferencia(referencia);
    }




}
