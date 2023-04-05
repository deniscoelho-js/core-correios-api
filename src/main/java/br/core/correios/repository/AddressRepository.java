package br.core.correios.repository;

import br.core.correios.model.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

public interface AddressRepository extends CrudRepository<Address, String> {

}
