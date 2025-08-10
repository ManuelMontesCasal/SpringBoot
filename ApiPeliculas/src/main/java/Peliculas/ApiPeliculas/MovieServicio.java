package Peliculas.ApiPeliculas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;

@Service
public class MovieServicio {

    private String token;

    //Crearemos objeto WebCLient//

    private WebClient webclient;


    //creamos un constructor que cree el objeto webCLient//

        public MovieServicio( @Value("${tmdb.api.base-url}")String urlBase,@Value("${tmdb.api.token}")
     String token){

                this.token = token;

                    webclient = WebClient.builder()
                    .baseUrl(urlBase).build();
            }

            public MovieModelo peliculasForID(long id){

                return webclient.get()
                        .uri(uriBuilder -> uriBuilder
                                .path("/movie/{id}")
                                .build(id))
                                .header(HttpHeaders.AUTHORIZATION, token)
                                .retrieve()
                                .bodyToMono(MovieModelo.class)
                                .block();



            }
        }
