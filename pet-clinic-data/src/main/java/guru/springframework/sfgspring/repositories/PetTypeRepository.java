package guru.springframework.sfgspring.repositories;

import guru.springframework.sfgspring.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
