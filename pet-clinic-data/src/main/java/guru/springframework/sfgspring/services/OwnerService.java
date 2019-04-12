package guru.springframework.sfgspring.services;

import guru.springframework.sfgspring.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
