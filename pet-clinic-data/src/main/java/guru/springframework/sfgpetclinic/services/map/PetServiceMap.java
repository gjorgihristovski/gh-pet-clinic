package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 12:32
 * Created in guru.springframework.sfgpetclinic.services.map for sfg-pet-clinic
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public void delete(Pet t) {
        super.delete(t);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }
}
