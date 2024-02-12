package com.da2a2324.psp.ud4.repositorios;

import com.da2a2324.psp.ud4.modelos.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRep extends JpaRepository<Departamento, Long> {
}
