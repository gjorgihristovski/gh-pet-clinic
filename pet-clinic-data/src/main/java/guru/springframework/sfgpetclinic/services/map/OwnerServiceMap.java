package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 12:26
 * Created in guru.springframework.sfgpetclinic.services.map for sfg-pet-clinic
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findByID(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void delete(Owner t) {
        super.delete(t);
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteByID(aLong);
    }
}