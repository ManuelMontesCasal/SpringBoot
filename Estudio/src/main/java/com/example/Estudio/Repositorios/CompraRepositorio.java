package com.example.Estudio.Repositorios;

import com.example.Estudio.Modelos.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepositorio extends JpaRepository<Compra, Long> {}
