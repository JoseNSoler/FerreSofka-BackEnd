package co.com.sofka.ferreteria.models;


import java.util.Objects;

public class Producto {
    private String id;
    private String referencia;
    private String proveedorNombre;
    private String referenciaID;
    private Integer valor;


    public Producto() {
    }


    // ------------------------------------ GETTERS ----------------------------------------
    public String getId() {
        return id;
    }

    public String getProveedorNombre() {
        return proveedorNombre;
    }

    public String getReferenciaID() {
        return referenciaID;
    }

    public Integer getValor() {
        return valor;
    }

    public String getReferencia() {
        return referencia;
    }

    // ------------------------------------ SETTERS ----------------------------------------
    public void setId(String id) {
        this.id = id;
    }

    public void setProveedorNombre(String proveedorNombre) {
        this.proveedorNombre = proveedorNombre;
    }

    public void setReferenciaID(String referenciaID) {
        this.referenciaID = referenciaID;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }


    public static Producto of(Producto newProducto){
        var productoOld = new Producto();
        productoOld.setId(newProducto.getId());
        productoOld.setReferencia(newProducto.getReferencia());
        productoOld.setValor(newProducto.getValor());
        productoOld.setProveedorNombre(newProducto.getProveedorNombre());
        productoOld.setReferenciaID(newProducto.getReferenciaID());
        return productoOld;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return id.equals(producto.id) && referencia.equals(producto.referencia) && proveedorNombre.equals(producto.proveedorNombre) && referenciaID.equals(producto.referenciaID) && Objects.equals(valor, producto.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, referencia, proveedorNombre, referenciaID, valor);
    }



    @Override
    public String toString() {
        return "\nProducto{" +
                "id='" + id + '\'' +
                ", referencia='" + referencia + '\'' +
                ", proveedorNombre='" + proveedorNombre + '\'' +
                ", referenciaID='" + referenciaID + '\'' +
                ", valor=" + valor +
                '}';
    }
}
