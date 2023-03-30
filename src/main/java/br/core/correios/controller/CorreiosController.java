package br.core.correios.controller;

import br.core.correios.model.Address;
import br.core.correios.service.CorreiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorreiosController {

    @Autowired
    private CorreiosService service;

    @GetMapping("/status")
    public String getStatus(){
        return "Service Status: "  + service.getStatus();
    }

    @GetMapping("/zipcode/{zipcode}")
    public Address getAdressByZipcode(@PathVariable("zipcode") String zipcode){
        return this.service.getAddressByZipcode(zipcode);
//        25:50
    }
}
