package io.quind.prueba.prestamolibro.adapters.outbound.jpa.postgresql.repositories;

import io.quind.prueba.prestamolibro.adapters.outbound.jpa.postgresql.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<UserEntity,Long> {
}
