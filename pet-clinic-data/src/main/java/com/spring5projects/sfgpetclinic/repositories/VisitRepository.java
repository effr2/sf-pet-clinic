package com.spring5projects.sfgpetclinic.repositories;

import com.spring5projects.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
