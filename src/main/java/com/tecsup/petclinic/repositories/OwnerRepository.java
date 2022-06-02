package com.tecsup.petclinic.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tecsup.petclinic.entities.Owner;

/**
 * 
 * @author jgomezm
 *
 */
@Repository
public interface OwnerRepository 
	extends CrudRepository<Owner, Long> {

		// Fetch owner by first_name
		List<Owner> findByFirstName(String firstName);

		// Fetch owner by telephone
		List<Owner> findByTelephone(String telephone);

}
