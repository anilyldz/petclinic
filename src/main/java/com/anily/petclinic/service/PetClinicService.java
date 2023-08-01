package com.anily.petclinic.service;

import java.util.List;

import com.anily.petclinic.exception.OwnerNotFoundException;
import com.anily.petclinic.model.Owner;

public interface PetClinicService {
	List<Owner> findOwners();
	List<Owner> findOwners(String lastName);
	Owner findOwner(Long id) throws OwnerNotFoundException;
	void create(Owner owner);
	void update(Owner owner);
	void deleteOwner(Long id);

}
