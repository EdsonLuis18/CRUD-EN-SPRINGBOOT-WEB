package com.contactos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contactos.modelo.Contacto;

public interface ContactoRepositorio extends JpaRepository <Contacto, Integer> {
    
}
