package com.softtek.web;

import com.softtek.web.controlador.PacienteControlador;
import com.softtek.web.repository.PacienteRepoImpl;
import com.softtek.web.servicio.IPacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spirng2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Spirng2Application.class, args);
    }
    @Autowired
   PacienteRepoImpl pacienteRepo;
    @Autowired
    IPacienteServicio pacienteServicio;
    @Autowired
    private PacienteControlador pacienteCont;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("SPRING Boot Application Started");
        System.out.println(pacienteCont.obtenerUno());
    }
}
