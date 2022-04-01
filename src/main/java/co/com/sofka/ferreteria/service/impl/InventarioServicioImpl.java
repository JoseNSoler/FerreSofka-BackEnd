package co.com.sofka.ferreteria.service.impl;

// import co.com.sofka.ferreteria.mapper.MapperInventario;
import co.com.sofka.ferreteria.models.Inventario;
import co.com.sofka.ferreteria.models.Producto;
import co.com.sofka.ferreteria.models.ProductosInventario;
import co.com.sofka.ferreteria.models.dto.DTOInventario;
import co.com.sofka.ferreteria.repository.interfaces.InterInventarioRepositorio;
import co.com.sofka.ferreteria.service.IinventarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class InventarioServicioImpl implements IinventarioServicio {
    @Autowired
    private InterInventarioRepositorio inventarioRepositorio;

    // MapperInventario mapperInventario = new MapperInventario();


    @Override
    public Mono<Inventario> guardarInventario(Inventario inventario) {
        return inventarioRepositorio.save(
                inventario);
    }

    @Override
    public Flux<Inventario> mostrarTodos(){
        return inventarioRepositorio.findAll();
    }

    @Override
    public Mono<Optional<ProductosInventario>> mostrarListaProductosPorReferencia(String referenciaNombre){

        var valor1 =inventarioRepositorio.findAll().map(lista -> lista.getProductosInventario())
                .map(lista -> lista.stream().filter(producto -> producto.getReferenciaNombre().equals(referenciaNombre)).findFirst());

        return valor1.single();
    }

    @Override
    public ResponseEntity agregarListaProductos(String id, ProductosInventario productosInventario){
        var resultado = inventarioRepositorio.findById(id).map(inventario -> {
            inventario.getProductosInventario().add(productosInventario);
            return inventario;
        }).flatMap(inventario -> inventarioRepositorio.save(inventario));

        return new ResponseEntity(resultado, HttpStatus.ACCEPTED);
    }



    //.anyMatch(producto -> producto.getReferenciaNombre().equals(referenciaNombre))


}
