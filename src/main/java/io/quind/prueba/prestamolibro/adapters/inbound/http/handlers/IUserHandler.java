package io.quind.prueba.prestamolibro.adapters.inbound.http.handlers;

import io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.request.UserRequestDTO;
import io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.response.UserResponseDTO;

import java.util.Optional;

public interface IUserHandler {
    void  createUser(UserRequestDTO userRequestDTO);
    void updateUser(UserRequestDTO userRequestDTO);
    Optional<UserResponseDTO> getAllUser();
    void deleteUserById(Long userId);
}
