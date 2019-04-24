package guru.springframework.sfgspring.repositories;

import guru.springframework.sfgspring.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepositort extends CrudRepository<Visit, Long> {
}
