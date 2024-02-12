package com.da2a2324.psp.ud4.servicios;

import com.da2a2324.psp.ud4.modelos.Departamento;

import java.util.List;

public interface IDepartamentoServicio {

    public List<Departamento> obtenerTodo();

    public Departamento guardar(Departamento departamento);

    public Departamento obtenerPorId(long id);

    public void eliminar(long id);

}
