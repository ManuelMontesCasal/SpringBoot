package wheather;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class ServicioWheather {

//Optencion de valores desde la APi externa, inyeccion de propiedades//

    @Value("${weather.api.key}")
    private String ApiKey;

    @Value("${weather.api.url}")
    private String ApiUrl;

    @Value("${weather.api.units}")
    private String unit;

    @Value("${weather.api.lang}")
    private String lang;


    /*
     * RestTemplate es una clase de Spring que permite hacer peticiones HTTP de forma sencilla
     * (como si fuera Postman, pero desde Java).
     */

    private final RestTemplate restTemplate = new RestTemplate();

//Construimos la URL//

    public ModeloWheather getWeatherByCity(String ciudad) {
        // Construimos la URL con los valores necesarios
        String url = String.format("%s?q=%s&appid=%s&units=%s&lang=%s",
                ApiUrl, ciudad, ApiKey, unit, lang);


        try{

            // Hacemos la llamada HTTP a la API externa//

                ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
                    Map body = response.getBody();


            // Validamos que la respuesta tenga los campos esperados//

                if (body == null || !body.containsKey("weather") || !body.containsKey("main")) {
                throw new RuntimeException("Respuesta de clima inválida");

                 }


            // Extraemos la descripción del clima
            String descripcion = ((Map)((List) body.get("weather")).get(0)).get("description").toString();
            // Extraemos la temperatura actual
            double temperatura = ((Number) ((Map) body.get("main")).get("temp")).doubleValue();


            // Devolvemos un objeto Java con los datos que nos interesan
            return new ModeloWheather(ciudad, descripcion, temperatura);

        } catch (Exception e) {
            // Capturamos cualquier error que ocurra en la llamada o procesamiento
            throw new RuntimeException("Error obteniendo el clima:");
        }
    }
}