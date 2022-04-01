package co.com.sofka.ferreteria.models;


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

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", proveedorNombre='" + proveedorNombre + '\'' +
                ", referenciaID='" + referenciaID + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
