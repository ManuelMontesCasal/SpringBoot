package wheather;

public class ModeloWheather {

/*Variables*/

    private String ciudad;
    private String descripcion;
    private double temperatura;

/*Constructor*/

    public ModeloWheather(String ciudad, String descripcion, double temperatura) {
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.temperatura = temperatura;
    }


/*Metodos getter y setter*/

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
