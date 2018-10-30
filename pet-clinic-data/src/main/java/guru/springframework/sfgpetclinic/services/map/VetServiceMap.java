package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 12:34
 * Created in guru.springframework.sfgpetclinic.services.map for sfg-pet-clinic
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public void delete(Vet t) {
        super.delete(t);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }
}
