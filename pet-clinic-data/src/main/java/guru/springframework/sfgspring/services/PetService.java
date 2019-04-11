package guru.springframework.sfgspring.services;

import guru.springframework.sfgspring.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
