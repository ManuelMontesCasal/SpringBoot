package Peliculas.ApiPeliculas;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieModelo {

    private long id;
    @JsonProperty("title")
    private String titulo;
    @JsonProperty("runtime")
    private int duracion;


    public MovieModelo(){}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    @Override
    public String toString() {
        return "MovieModelo{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}






