package com.coches.config;


import com.coches.entities.Coche;
import com.coches.repositories.CochesDB;
import com.coches.repositories.CochesDBMemoria;
import com.coches.repositories.CochesPorClase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ConfigBean {

    @Bean
    public Coche coche() {
        return new Coche();
    }

    @Bean
    public CochesDB cochedb() {
        return new CochesDBMemoria();
    }

    @Bean
    public CochesPorClase cochesPorClase() {
        return new CochesDBMemoria();
    }
}
