package com.contactos.servicio;

import java.util.List;

import com.contactos.modelo.Contacto;

public interface IContactoServicio {
    public List<Contacto> listarContacto();

    public Contacto buscarContactoPorId(Integer idContacto);

    public void guardarContacto(Contacto Contacto);

    public void eliminarContacto(Contacto Contacto);
}
