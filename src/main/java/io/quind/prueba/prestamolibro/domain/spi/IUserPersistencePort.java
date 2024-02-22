package io.quind.prueba.prestamolibro.domain.spi;

import io.quind.prueba.prestamolibro.domain.models.User;

import java.util.Optional;

public interface IUserPersistencePort {
    void createUser(User user);
    void updateUser(User user);
    Optional<User> getAllUser();
    void deleteUserById(Long userId);

}
