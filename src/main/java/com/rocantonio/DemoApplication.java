package com.rocantonio;

import com.rocantonio.Service.EquipoService;
import com.rocantonio.Service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    private static JugadorService jugadorService;
    private static EquipoService equipoService;

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        jugadorService = context.getBean(JugadorService.class);
        equipoService = context.getBean(EquipoService.class);
        jugadorService.testJugadores();
        equipoService.testEquipos();
    }
}
