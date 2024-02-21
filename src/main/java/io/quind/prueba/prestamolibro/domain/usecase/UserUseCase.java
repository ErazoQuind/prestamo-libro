package io.quind.prueba.prestamolibro.domain.usecase;

import io.quind.prueba.prestamolibro.domain.api.IUserServicePort;
import io.quind.prueba.prestamolibro.domain.spi.IUserPersistencePort;

public class UserUseCase implements IUserServicePort {
    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }
}
