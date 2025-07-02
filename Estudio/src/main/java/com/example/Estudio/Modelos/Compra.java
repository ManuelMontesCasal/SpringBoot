package com.example.Estudio.Modelos;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Compra {

//Variables//
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) // Añade esta línea
private Long idArticulo;

private String nombreArticulo;
private String descripcion;
private double precio;


//Metodos Getter y Setter//



    public long getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(long idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
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
}
