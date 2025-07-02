package MongoDB.Controladores;

import MongoDB.Modelos.Cliente;
import MongoDB.Servicios.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Clientes")
public class ClienteControlador {

    private ClienteServicio clienteservicio;

    @Autowired
    public ClienteControlador(ClienteServicio clienteservicio){

        this.clienteservicio = clienteservicio;
    }
    @PostMapping("/crear")
    public ResponseEntity<Cliente> crearCLiente(@RequestBody Cliente cliente){

            Cliente nuevoCliente = clienteservicio.GuardarCliente(cliente);

                return new ResponseEntity<>(nuevoCliente,HttpStatus.CREATED);
    }
}