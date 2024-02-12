package com.da2a2324.psp.ud4.modelos;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "departamento")
public class Departamento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_dep;

    private String nombre;
    private String localidad;

    public Departamento(){}

    public long getId_dep() {
        return id_dep;
    }

    public void setId_dep(long id) {
        this.id_dep = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    private static long getserialVersionUID(){
        return serialVersionUID;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString(){
        return this.getId_dep()+" - "+this.getNombre()+" "+this.getLocalidad();
    }
}
