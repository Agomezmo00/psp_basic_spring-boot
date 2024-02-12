package com.da2a2324.psp.ud4.controladores;

import com.da2a2324.psp.ud4.modelos.Departamento;
import com.da2a2324.psp.ud4.servicios.DepartamentoServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DepartamentoController {


    @Autowired
    DepartamentoServicioImpl departamentoServicio;

    @GetMapping("/departamentos")
    public List<Departamento> obtenerDepartamentos(){
        return departamentoServicio.obtenerTodo();
    }


    @PostMapping("/guardarDep")
    public ResponseEntity<Departamento> guardarDepartamento(@RequestBody Departamento departamento){
        Departamento nuevo_departamento = departamentoServicio.guardar(departamento);
        return new ResponseEntity<>(nuevo_departamento, HttpStatus.CREATED);
    }

    @GetMapping("/departamento/{id}")
    public ResponseEntity<Departamento> obtenerDepartamentoId(@PathVariable long id){
        Departamento departamentoPorId = departamentoServicio.obtenerPorId(id);
        return ResponseEntity.ok(departamentoPorId);
    }

    @PutMapping("/departamento/{id}")
    public ResponseEntity<Departamento> actualizarDepartamento(@PathVariable long id, @RequestBody Departamento departamento){
        Departamento departamentoPorId = departamentoServicio.obtenerPorId(id);

        departamentoPorId.setNombre(departamento.getNombre());
        departamentoPorId.setLocalidad(departamento.getLocalidad());

        Departamento departamentoActualizado = departamentoServicio.guardar(departamentoPorId);
        return new ResponseEntity<>(departamentoActualizado, HttpStatus.CREATED);
    }

    @DeleteMapping("/departamento/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarDepartamento(@PathVariable long id){
        this.departamentoServicio.eliminar(id);

        HashMap<String, Boolean> estadoDepartamentoEliminado = new HashMap<>();
        estadoDepartamentoEliminado.put("eliminado", true);
        return ResponseEntity.ok(estadoDepartamentoEliminado);
    }


}
