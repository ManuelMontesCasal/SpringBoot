package com.example.Estudio.Controladores;

import com.example.Estudio.Modelos.Usuario;
import com.example.Estudio.Servicios.UsuarioServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicios usuarioservicio;

        @GetMapping("/listar")
        public ResponseEntity<List<Usuario>> ListarUsuarios(){

            List<Usuario> usuarios = usuarioservicio.obtenerUsuarios();

                return new ResponseEntity<>(usuarios, HttpStatus.OK);

        }
        @PostMapping("/crear")
        public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario NuevoUsuario){

           Usuario usuarioCreado = usuarioservicio.guardarUsuario(NuevoUsuario);

                return new ResponseEntity<>(usuarioCreado, HttpStatus.CREATED);


        }



}
