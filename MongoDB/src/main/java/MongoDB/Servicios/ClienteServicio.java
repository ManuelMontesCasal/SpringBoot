package MongoDB.Servicios;

import MongoDB.Modelos.Cliente;
import MongoDB.Repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServicio {

    private ClienteRepositorio clienterepositorio;

    @Autowired
    public ClienteServicio(ClienteRepositorio clienterepositorio){

                this.clienterepositorio = clienterepositorio;

    }

    public Cliente GuardarCliente(Cliente cliente) {

        return clienterepositorio.save(cliente);

    }

    public Optional<Cliente> ListID(String id){

            return clienterepositorio.findById(id);

    }

}
