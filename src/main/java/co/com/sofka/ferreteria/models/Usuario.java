package co.com.sofka.ferreteria.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuarios")
public class Usuario {
    @Id
    private String id;

    private String identificacion;
    // Tipos de usuario: Empleado, Cliente, Proveedor
    private String tipo;

    private String nombre;

    //Manejo casos numeros internacionales +57
    private String numeroContacto;



    public Usuario() {
    }

    public Usuario(String id, String identificacion, String tipo, String nombre, String numeroContacto) {
        this.id = id;
        this.identificacion = identificacion;
        this.tipo = tipo;
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
    }


    // ------------------------------------ GETTERS ----------------------------------------
    public String getId() {
        return id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }


    // ------------------------------------ SETTERS ----------------------------------------


    public void setId(String id) {
        this.id = id;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
}
