package guru.springframework.sfgspring.repositories;

import guru.springframework.sfgspring.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
