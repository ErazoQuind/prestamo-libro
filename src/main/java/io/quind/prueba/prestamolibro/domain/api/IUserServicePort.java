package io.quind.prueba.prestamolibro.domain.api;

import io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.request.UserRequestDTO;
import io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.response.UserResponseDTO;
import io.quind.prueba.prestamolibro.domain.models.User;

import java.util.Optional;

public interface IUserServicePort {
    void createUser(User user);
    void updateUser(User user);
    Optional<User> getAllUser();
    void deleteUserById(Long userId);

}
