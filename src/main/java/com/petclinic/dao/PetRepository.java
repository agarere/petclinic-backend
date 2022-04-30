package com.petclinic.dao;

import java.util.List;

import com.petclinic.model.Pet;

public interface PetRepository {

	Pet findById(Long id);
	
	List<Pet> findByOwner(Long ownerId);
	
	void create(Pet pet);
	
	Pet update(Pet pet);
	
	void delete(Long id);
	
	void deleteByOwnerId(Long id);
	
	
}
