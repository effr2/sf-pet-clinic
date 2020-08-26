package com.spring5projects.sfgpetclinic.services;

import com.spring5projects.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
