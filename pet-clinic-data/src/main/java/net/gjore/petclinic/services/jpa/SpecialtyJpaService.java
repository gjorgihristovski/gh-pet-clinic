package net.gjore.petclinic.services.jpa;

import net.gjore.petclinic.model.Speciality;
import net.gjore.petclinic.repositories.SpecialityRepository;
import net.gjore.petclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gjorgi.hristovski on 06-Nov-18 in 11:13
 * Created in guru.springframework.sfgpetclinic.services.jpa for sfg-pet-clinic
 */
@Service
@Profile("jpa")
public class SpecialtyJpaService implements SpecialtyService {

    private final SpecialityRepository specialityRepository;

    public SpecialtyJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findByID(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public void delete(Speciality speciality) {
        specialityRepository.delete(speciality);
    }

    @Override
    public void deleteByID(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
