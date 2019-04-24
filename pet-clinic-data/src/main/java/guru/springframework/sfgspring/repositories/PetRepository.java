package guru.springframework.sfgspring.repositories;

import guru.springframework.sfgspring.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
