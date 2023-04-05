package br.core.correios.repository;

import br.core.correios.model.AddressStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

public interface AddressStatusRepository extends CrudRepository<AddressStatus, Integer> {

}
