package com.example.Estudio.Servicios;
import com.example.Estudio.Modelos.Usuario;
import com.example.Estudio.Repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicios {

    //Inyeccion de dependencia del repositorio//
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

//Metodos CRUD//

    public List<Usuario> obtenerUsuarios(){

            return usuarioRepositorio.findAll();

    }

    public Optional<Usuario> obtenerUsuarioID(Long id){

            return usuarioRepositorio.findById(id);

    }

    public Usuario guardarUsuario(Usuario usuario){

            return usuarioRepositorio.save(usuario);

    }

}
