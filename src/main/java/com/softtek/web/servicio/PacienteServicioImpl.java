package com.softtek.web.servicio;

import com.softtek.web.modelo.Paciente;
import com.softtek.web.repository.IPacienteRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PacienteServicioImpl implements IPacienteServicio{
    @Autowired
    IPacienteRepo repo;
    @Override
    public String obtenerUno(Paciente p1) {
        return repo.obtenerUno(p1);
    }
}
