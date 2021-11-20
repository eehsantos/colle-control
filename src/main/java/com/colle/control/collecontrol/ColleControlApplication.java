package com.colle.control.collecontrol;

import com.colle.control.collecontrol.service.CadastroService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColleControlApplication {

    public static void main(String[] args) {
        new CadastroService().funcionalidadeMenu();
        //SpringApplication.run(ColleControlApplication.class, args);
        //
    }

}
