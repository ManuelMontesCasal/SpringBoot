package Peliculas.ApiPeliculas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/movie")
public class MovieControlador {

    private MovieServicio movieServicio;

        @Autowired
        public MovieControlador(MovieServicio movieServicio){

                this.movieServicio = movieServicio;

        }

        @GetMapping("/{id}")
        public ResponseEntity<MovieModelo> verPelicula(@PathVariable long id){

                MovieModelo movieModelo = movieServicio.peliculasForID(id);

                    return ResponseEntity.ok(movieModelo);
        }
    }





