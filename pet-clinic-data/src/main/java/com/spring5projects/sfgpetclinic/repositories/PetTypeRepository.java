package com.spring5projects.sfgpetclinic.repositories;

import com.spring5projects.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
