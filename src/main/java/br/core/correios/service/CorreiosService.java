package br.core.correios.service;


import br.core.correios.exception.NoContentException;
import br.core.correios.model.Address;
import br.core.correios.model.Status;
import br.core.correios.repository.AddressRepository;
import br.core.correios.repository.AddressStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class CorreiosService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AddressStatusRepository addressStatusRepository;

    public Status getStatus(){
        return Status.READY;
    }

    public Address getAddressByZipcode(String zipcode) throws NoContentException{
        return addressRepository.findById(zipcode)
                .orElseThrow(NoContentException::new)
                ;
    }

    public void setup(){

    }
}
