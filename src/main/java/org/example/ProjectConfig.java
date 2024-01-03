package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean(name = "miki")
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean(value = "Miki")
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }
    @Bean("MIki")
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }

}
