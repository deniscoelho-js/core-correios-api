package br.core.correios.repository;

import br.core.correios.model.Address;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SetupRepository {
    public List<Address> getFromOrigin(){
        return new ArrayList<>();
    }

    //47:03
}
