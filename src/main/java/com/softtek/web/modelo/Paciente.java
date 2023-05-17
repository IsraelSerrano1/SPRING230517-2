package com.softtek.web.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Paciente {
    private int idPaciente;
    private String nombre;
    private int edad;

}
