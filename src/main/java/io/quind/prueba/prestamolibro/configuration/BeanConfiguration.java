package io.quind.prueba.prestamolibro.configuration;

import io.quind.prueba.prestamolibro.adapters.outbound.jpa.postgresql.adapters.UserPostgreSqlAdapter;
import io.quind.prueba.prestamolibro.adapters.outbound.jpa.postgresql.mappers.IUserEntityMapper;
import io.quind.prueba.prestamolibro.adapters.outbound.jpa.postgresql.repositories.IUserRepository;
import io.quind.prueba.prestamolibro.domain.api.IUserServicePort;
import io.quind.prueba.prestamolibro.domain.spi.IUserPersistencePort;
import io.quind.prueba.prestamolibro.domain.usecase.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    @Bean
    public IUserServicePort userServicePort(){
        return new UserUseCase(userPersistencePort());
    }

    @Bean
    public IUserPersistencePort userPersistencePort(){
        return new UserPostgreSqlAdapter(userRepository,userEntityMapper);
    }
}
