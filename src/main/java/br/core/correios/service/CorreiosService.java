package br.core.correios.service;


import br.core.correios.model.Address;
import br.core.correios.model.Status;
import org.springframework.stereotype.Service;

@Service
public class CorreiosService {

    public Status getStatus(){
        return Status.READY;
    }

    public Address getAddressByZipcode(String zipcode){
        return null;
    }

    public void setup(){

    }
}
