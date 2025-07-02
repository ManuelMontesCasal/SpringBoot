package MongoDB.Repositorios;

import MongoDB.Modelos.Productos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productosRepositorio extends MongoRepository<Productos,String> {

}
