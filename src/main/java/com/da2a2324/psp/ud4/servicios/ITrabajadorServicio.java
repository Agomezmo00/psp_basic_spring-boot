package com.da2a2324.psp.ud4.servicios;

import com.da2a2324.psp.ud4.modelos.Trabajador;

import java.util.List;

public interface ITrabajadorServicio {

    public List<Trabajador> obtenerTodo();
    public Trabajador guardar(Trabajador trabajador);
    public Trabajador obtenerPorId(long id);
    public void eliminar(long id);
}
