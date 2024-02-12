package com.da2a2324.psp.ud4.servicios;

import com.da2a2324.psp.ud4.modelos.Departamento;
import com.da2a2324.psp.ud4.repositorios.DepartamentoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoServicioImpl implements IDepartamentoServicio{

    @Autowired
    DepartamentoRep departamentoRep;
    @Override
    public List<Departamento> obtenerTodo(){
        return departamentoRep.findAll();
    }

    @Override
    public Departamento guardar(Departamento departamento){
        return departamentoRep.save(departamento);
    }

    @Override
    public Departamento obtenerPorId(long id){
        return departamentoRep.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id){
        departamentoRep.deleteById(id);
    }


}
