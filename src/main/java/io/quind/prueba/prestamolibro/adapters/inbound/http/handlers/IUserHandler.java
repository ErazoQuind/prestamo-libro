package io.quind.prueba.prestamolibro.adapters.inbound.http.handlers;

import io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.request.UserRequestDTO;
import io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.response.UserResponseDTO;

public interface IUserHandler {
    UserResponseDTO createUser(UserRequestDTO userRequestDTO);
}
