package com.spring5projects.sfgpetclinic.services.map;


import com.spring5projects.sfgpetclinic.model.Visit;
import com.spring5projects.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null ||
                visit.getPet().getOwner() == null ||
                visit.getPet().getId() == null ||
                visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);

    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
