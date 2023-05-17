package com.softtek.web.repository;

import com.softtek.web.modelo.Paciente;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@NoArgsConstructor
public class PacienteRepoImpl implements IPacienteRepo{
    @Override
    public String obtenerUno(Paciente p1) {
        return p1.toString();
    }
}
