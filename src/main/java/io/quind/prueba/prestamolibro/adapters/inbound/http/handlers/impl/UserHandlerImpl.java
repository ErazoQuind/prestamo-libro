package io.quind.prueba.prestamolibro.adapters.inbound.http.handlers.impl;

import io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.request.UserRequestDTO;
import io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.response.UserResponseDTO;
import io.quind.prueba.prestamolibro.adapters.inbound.http.handlers.IUserHandler;

public class UserHandlerImpl implements IUserHandler {
    @Override
    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        return null;
    }
}
