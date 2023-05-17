package com.softtek.web.controlador;

import com.softtek.web.modelo.Paciente;
import com.softtek.web.servicio.IPacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PacienteControlador {
    @Autowired
    private IPacienteServicio servicio;

    @GetMapping("/paciente")
    public String obtenerUno(){
        return servicio.obtenerUno(new Paciente(1,"Ernesto", 25));
    }
}
