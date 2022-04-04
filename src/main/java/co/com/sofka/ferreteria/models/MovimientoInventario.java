package co.com.sofka.ferreteria.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class MovimientoInventario {
    private String id;

    private String fechaCreacion = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    private List<Producto> productos;

    // Dos tipos de movimiento: FACTURA - resta productos de inventario -- ENTRADA: entrada inventario por parte de un proveedor
    private String tipo;

    // Nombre del proveedor para entradas, o nombre del cliente para facturas
    private String nombreBeneficiario;

    private String identificacion;

    // Total a pagar a los proveedores o total a pagar por parte del cliente
    private Integer total;

    public MovimientoInventario() {

    }

    public MovimientoInventario(String id, String fechaCreacion, List<Producto> productos, String tipo, String nombreBeneficiario, String identificacion, Integer total) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.productos = productos;
        this.tipo = tipo;
        this.nombreBeneficiario = nombreBeneficiario;
        this.identificacion = identificacion;
        this.total = total;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreBeneficiario() {
        return nombreBeneficiario;
    }

    public void setNombreBeneficiario(String nombreBeneficiario) {
        this.nombreBeneficiario = nombreBeneficiario;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "\n MovimientoInventario{" +
                "id='" + id + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ",\n,productos=" + productos +
                ",\ntipo='" + tipo + '\'' +
                ", nombreBeneficiario='" + nombreBeneficiario + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", total=" + total +
                "\n}";
    }
}
