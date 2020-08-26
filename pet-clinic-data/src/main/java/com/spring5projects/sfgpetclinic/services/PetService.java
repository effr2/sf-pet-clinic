package com.spring5projects.sfgpetclinic.services;

import com.spring5projects.sfgpetclinic.model.Owner;
import com.spring5projects.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
