package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by gjorgi.hristovski on 06-Nov-18 in 11:30
 * Created in guru.springframework.sfgpetclinic.services.map for sfg-pet-clinic
 */
@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findByID(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null || visit.getPet().getOwner().getId() == null){
            throw new RuntimeException("Invalid Visist");
        }
        return super.save(visit);
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteByID(aLong);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }
}
