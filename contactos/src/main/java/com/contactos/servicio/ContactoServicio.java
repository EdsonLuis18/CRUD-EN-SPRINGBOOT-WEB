package com.contactos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactos.modelo.Contacto;
import com.contactos.repositorio.ContactoRepositorio;
@Service
public class ContactoServicio implements IContactoServicio{

    @Autowired
    private ContactoRepositorio contactoRepositorio;

    @Override
    public List<Contacto> listarContacto() {
        return contactoRepositorio.findAll();
     }

    @Override
    public Contacto buscarContactoPorId(Integer idContacto) {
        Contacto contacto = contactoRepositorio.findById(idContacto).orElse(null);
        return contacto;
        }

    @Override
    public void guardarContacto(Contacto contacto) {
        contactoRepositorio.save(contacto);
    }

    @Override
    public void eliminarContacto(Contacto contacto) {
        contactoRepositorio.delete(contacto);
}
    
}
