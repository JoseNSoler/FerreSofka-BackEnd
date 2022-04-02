package co.com.sofka.ferreteria.models;

import java.util.List;

public class ProductosInventario {
    private List<Producto> productos;
    private String referenciaNombre;


    private Integer minimoRequerido; // Cuando se crea una lista de productos, se debe crear bajo cierta cantidad de productos
    private Integer maximoPermitido; // Limita la cantidad maxima de productos permitidos
    private Integer valorTotal;


    public ProductosInventario() {
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        if(productos.size() < minimoRequerido || productos.size() > maximoPermitido)
            throw new IllegalArgumentException("Error, lista debe estar entre los tamaños" + minimoRequerido + "=" + maximoPermitido);
        this.productos = productos;
    }

    public String getReferenciaNombre() {
        return referenciaNombre;
    }

    public void setReferenciaNombre(String referenciaNombre) {
        this.referenciaNombre = referenciaNombre;
    }




    public Integer getMinimoRequerido() {
        return minimoRequerido;
    }

    public void setMinimoRequerido(Integer minimoRequerido) {
        this.minimoRequerido = minimoRequerido;
    }

    public Integer getMaximoPermitido() {
        return maximoPermitido;
    }

    public void setMaximoPermitido(Integer maximoPermitido) {
        this.maximoPermitido = maximoPermitido;
    }

    public Integer getValorTotal(){
        if(productos.size()>0) return productos.stream().mapToInt(value -> value.getValor()).sum();
        return 0;
    }

    @Override
    public String toString() {
        return "ProductosInventario{" +
                "productos=" + productos + "\n" +
                ", referenciaNombre='" + referenciaNombre + '\'' +
                ", minimoRequerido=" + minimoRequerido +
                ", maximoPermitido=" + maximoPermitido +
                ", valorTotal=" + valorTotal + "\n" +
                '}';
    }
}
