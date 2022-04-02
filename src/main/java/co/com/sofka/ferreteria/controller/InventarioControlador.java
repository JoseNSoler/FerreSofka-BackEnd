package co.com.sofka.ferreteria.controller;

//import co.com.sofka.ferreteria.mapper.MapperInventario;
import co.com.sofka.ferreteria.models.Inventario;
import co.com.sofka.ferreteria.models.Producto;
import co.com.sofka.ferreteria.models.ProductosInventario;
import co.com.sofka.ferreteria.service.impl.InventarioServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
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

    @PostMapping("/agregarListaProductos/{id}")
    private ResponseEntity agregarListaProductos(@PathVariable("id") String id, @RequestBody ProductosInventario productosInventario){
        return inventarioServicio.agregarListaProductos(id, productosInventario);
    }


    @PutMapping("/modificarProductosDeListaPorRef/{idInventario}/{referencia}")
    private ResponseEntity modificarProductosHaciaListaPorRef(
            @PathVariable("idInventario") String id, @PathVariable("referencia") String referencia,
            @RequestBody List<Producto> productos){
        return inventarioServicio.modificarProductosHaciaListaPorRef(id, referencia , productos);
    }


    // ---------------------- AGREGAR OBJECTO LISTA
    @PostMapping("/agregarProductosDeListaPorRef/{idInventario}/{referencia}")
    private ResponseEntity agregarProductosHaciaListaPorRef(
            @PathVariable("idInventario") String id, @PathVariable("referencia") String referencia,
            @RequestBody List<Producto> productos){
        return inventarioServicio.agregarProductosHaciaListaPorRef(id, referencia , productos);
    }

    // ---------------------- ELIMINAR OBJECTO LISTA
    @DeleteMapping("/eliminarProductosDeListaPorRef/{idInventario}/{referencia}")
    private ResponseEntity eliminarProductoDeLista(
            @PathVariable("idInventario") String id, @PathVariable("referencia") String referencia,
            @RequestBody List<Producto> productos){
                return inventarioServicio.eliminarProductosDeListaPorRef(id, referencia , productos);
    }

    @PostMapping("/guardar")
    public Mono<Inventario> guardar(@RequestBody Inventario inventario){
            return inventarioServicio.guardarInventario(inventario);

    }

    @GetMapping("/productosInventarioPorReferencia/{idInventario}/{name}")
    public Mono<Optional<ProductosInventario>> buscarListaPorReferencia(
            @PathVariable("idInventario") String idInventario , @PathVariable("name")  String referencia){
        return inventarioServicio.mostrarListaProductosPorReferencia(idInventario, referencia);
    }




}
