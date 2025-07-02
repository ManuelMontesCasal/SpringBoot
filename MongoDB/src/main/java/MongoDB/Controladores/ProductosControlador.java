package MongoDB.Controladores;

import MongoDB.Modelos.Productos;
import MongoDB.Servicios.ProductosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Productos")
public class ProductosControlador {

    private ProductosServicios productosServicios;

    @Autowired
    public ProductosControlador(ProductosServicios productosServicios){

            this.productosServicios = productosServicios;
    }
        @PostMapping
        public ResponseEntity<Productos> crearProducto(@RequestBody Productos producto){

                Productos nuevoProducto = productosServicios.nuevoProducto(producto);

                    return new ResponseEntity<>(nuevoProducto, HttpStatus.CREATED);


        }
}
