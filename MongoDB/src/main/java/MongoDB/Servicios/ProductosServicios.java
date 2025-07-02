package MongoDB.Servicios;

import MongoDB.Modelos.Productos;
import MongoDB.Repositorios.productosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosServicios {

 private productosRepositorio productosrepositorio;
    @Autowired
    public ProductosServicios(productosRepositorio productosrepositorio){

        this.productosrepositorio = productosrepositorio;
    }


    public Productos nuevoProducto(Productos producto){

            return productosrepositorio.save(producto);
    }
}
