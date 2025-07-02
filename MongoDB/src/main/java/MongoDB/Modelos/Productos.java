package MongoDB.Modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Productos {
    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private double precio;
    @DBRef
    private Cliente ClientePropietario;


    public Productos() {

    }

    public Productos(String nombre, String descripcion, double precio, Cliente clientePropietario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        ClientePropietario = clientePropietario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Cliente getClientePropietario() {
        return ClientePropietario;
    }

    public void setClientePropietario(Cliente clientePropietario) {
        ClientePropietario = clientePropietario;
    }
}