package io.quind.prueba.prestamolibro.domain.spi;

import io.quind.prueba.prestamolibro.domain.models.User;

import java.util.Optional;

public interface IUserPersistencePort {
    void saveUser(User user);
    Optional<User> getAllUser();
    void deleteUserById(Long userId);

}
