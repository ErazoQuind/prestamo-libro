package io.quind.prueba.prestamolibro.domain.usecase;

import io.quind.prueba.prestamolibro.domain.api.IUserServicePort;
import io.quind.prueba.prestamolibro.domain.models.User;
import io.quind.prueba.prestamolibro.domain.spi.IUserPersistencePort;

import java.util.Optional;

public class UserUseCase implements IUserServicePort {
    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void createUser(User user) {
        //todo: validar usuario no existe
        userPersistencePort.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        //todo: validar usuario existe
        userPersistencePort.saveUser(user);
    }

    @Override
    public Optional<User> getAllUser() {
        return Optional.empty();
    }

    @Override
    public void deleteUserById(Long userId) {

    }
}
