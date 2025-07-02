package com.example.Estudio.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigCORP implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Aplica la política CORS a todas las rutas bajo /api/
                .allowedOrigins("*")   // <--- ¡Permite cualquier origen! (Solo para pruebas)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Permite estos métodos HTTP
                .allowedHeaders("*")   // Permite todos los encabezados
                .allowCredentials(false); // <--- ¡Deshabilita el manejo de credenciales!
    }
}