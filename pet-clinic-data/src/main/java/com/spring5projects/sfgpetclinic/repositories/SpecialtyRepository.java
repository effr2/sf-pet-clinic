package com.spring5projects.sfgpetclinic.repositories;

import com.spring5projects.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
