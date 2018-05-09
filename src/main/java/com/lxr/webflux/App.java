package com.lxr.webflux;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.reactive.config.EnableWebFlux;

import static org.springframework.boot.SpringApplication.run;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableWebFlux
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext applicationContext = run(App.class, args);
    }
}
