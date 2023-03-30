package br.core.correios.controller;

import br.core.correios.model.Adress;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class CorreiosController {

    @GetMapping("/status")
    public String getStatus(){
        return "UP";
    }

    @GetMapping("/zipcode/{zipcode}")
    public Adress getAdressByZipcode(@PathParam("zipcode") String zipcode){
        return Adress.builder().zipcode(zipcode).build();
    }
}
