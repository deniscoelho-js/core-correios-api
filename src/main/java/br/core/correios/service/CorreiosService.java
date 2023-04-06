package br.core.correios.service;


import br.core.correios.exception.NoContentException;
import br.core.correios.exception.NoTReadyException;
import br.core.correios.model.Address;
import br.core.correios.model.AddressStatus;
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
        return this.addressStatusRepository.findById(AddressStatus.DEFAULT_ID)
                .orElse(AddressStatus.builder().status(Status.NEED_SETUP).build()).getStatus();

    }

    public Address getAddressByZipcode(String zipcode) throws NoContentException, NoTReadyException{
        if(!this.getStatus().equals(Status.READY))
            throw new NoTReadyException();

        return addressRepository.findById(zipcode)
                .orElseThrow(NoContentException::new)
                ;
    }

    public void setup(){

    }
}
