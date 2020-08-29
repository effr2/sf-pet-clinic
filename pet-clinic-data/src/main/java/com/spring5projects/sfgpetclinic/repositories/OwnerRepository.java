package com.spring5projects.sfgpetclinic.repositories;

import com.spring5projects.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
