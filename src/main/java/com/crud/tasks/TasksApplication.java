package com.crud.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TasksApplication {
        //External configuration (local)
        //extends SpringBootServletInitializer { //--KONIECZNIE DO URUCHOMIENIA ZEWNĘTRZNEGO TOMCATA, wyłączyć dla Heroku {


    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    //External configuration (local)
    //--KONIECZNIE DO URUCHOMIENIA ZEWNĘTRZNEGO TOMCATA, wyłączyć dla Heroku

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(TasksApplication.class);
//    }
}
