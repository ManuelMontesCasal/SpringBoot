package wheather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clima")
public class controladorWheather {

    @Autowired
    private ServicioWheather servicioWheather;
        @GetMapping("/{ciudad}")
        public ResponseEntity<ModeloWheather> ObtenerClima(@PathVariable String ciudad) {

            try {
                ModeloWheather clima = servicioWheather.getWeatherByCity(ciudad);

                return ResponseEntity.ok(clima);

            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
}
