package MongoDB.WebConfig; // O el paquete que prefieras, ej. MongoDB

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // Indica a Spring que esta es una clase de configuración
public class ConfiWeb implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Aplica esta configuración CORS a todas las rutas bajo /api/
                .allowedOrigins("http://localhost:63342") // ¡Permite el origen de tu IntelliJ!
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Permite los métodos HTTP que usarás
                .allowedHeaders("*") // Permite todas las cabeceras en las peticiones
                .allowCredentials(true) // Permite el envío de cookies de autenticación (si las usas)
                .maxAge(3600); // Duración en segundos de la pre-flight request (OPTIONS)
    }
}