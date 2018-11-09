package net.gjore.petclinic.services.map;

import net.gjore.petclinic.model.PetType;
import net.gjore.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by gjorgi.hristovski on 02-Nov-18 in 14:01
 * Created in guru.springframework.sfgpetclinic.services.map for sfg-pet-clinic
 */
@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public PetType save(PetType t) {
        return super.save(t);
    }

    @Override
    public void delete(PetType  t) {
        super.delete(t);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }
}
