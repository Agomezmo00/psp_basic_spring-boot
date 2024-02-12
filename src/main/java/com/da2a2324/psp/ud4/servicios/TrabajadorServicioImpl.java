package com.da2a2324.psp.ud4.servicios;

import com.da2a2324.psp.ud4.modelos.Trabajador;
import com.da2a2324.psp.ud4.repositorios.TrabajadorRep;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TrabajadorServicioImpl implements ITrabajadorServicio{
    @Autowired
    TrabajadorRep trabajadorRep;

    public List<Trabajador> obtenerTodo(){
        return trabajadorRep.findAll();
    }


    public Trabajador guardar(Trabajador trabajador){ return trabajadorRep.save(trabajador); }

    public Trabajador obtenerPorId(long id){
        return trabajadorRep.findById(id).orElse(null);
    }

    public void eliminar(long id){
        trabajadorRep.deleteById(id);
    }

}
