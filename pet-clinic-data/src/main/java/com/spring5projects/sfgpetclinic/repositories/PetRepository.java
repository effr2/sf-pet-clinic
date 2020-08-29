package com.spring5projects.sfgpetclinic.repositories;

import com.spring5projects.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
