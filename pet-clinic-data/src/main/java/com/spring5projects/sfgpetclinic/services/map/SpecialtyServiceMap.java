package com.spring5projects.sfgpetclinic.services.map;

import com.spring5projects.sfgpetclinic.model.Specialty;
import com.spring5projects.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Specialty save(Specialty specialty) {
        return super.save(specialty);
    }

    @Override
    public void delete(Specialty specialty) {
        super.delete(specialty);

    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
