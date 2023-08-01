package com.anily.petclinic.dao;

import java.util.List;

import com.anily.petclinic.model.Pet;

public interface PetRepository {
	Pet findById(Long id);
	List<Pet> findByOwnerId(Long ownerId);
	void create(Pet pet);
	Pet update(Pet owner);
	void delete(Long id);
	void deleteByOwnerId(Long ownerId);
}
