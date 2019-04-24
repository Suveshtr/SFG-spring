package guru.springframework.sfgspring.repositories;

import guru.springframework.sfgspring.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
