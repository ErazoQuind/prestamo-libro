package io.quind.prueba.prestamolibro.adapters.outbound.jpa.postgresql.adapters;

import io.quind.prueba.prestamolibro.adapters.outbound.jpa.postgresql.mappers.IUserEntityMapper;
import io.quind.prueba.prestamolibro.adapters.outbound.jpa.postgresql.repositories.IUserRepository;
import io.quind.prueba.prestamolibro.domain.models.User;
import io.quind.prueba.prestamolibro.domain.spi.IUserPersistencePort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
@Transactional
public class UserPostgreSqlAdapter implements IUserPersistencePort {
    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    @Override
    public void saveUser(User user) {
      userRepository.save(userEntityMapper.toEntity(user));
    }

    @Override
    public Optional<User> getAllUser() {
        return Optional.empty();
    }

    @Override
    public void deleteUserById(Long userId) {

    }
}
