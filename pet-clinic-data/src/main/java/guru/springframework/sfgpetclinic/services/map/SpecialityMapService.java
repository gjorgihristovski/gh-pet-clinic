package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by gjorgi.hristovski on 02-Nov-18 in 15:01
 * Created in guru.springframework.sfgpetclinic.services.map for sfg-pet-clinic
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findByID(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return super.save(speciality);
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteByID(aLong);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }
}
