package services;

import com.springpetclinic.sfgpetclinic.model.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
