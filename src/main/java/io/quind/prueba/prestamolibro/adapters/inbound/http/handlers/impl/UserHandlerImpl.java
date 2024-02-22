package io.quind.prueba.prestamolibro.adapters.inbound.http.handlers.impl;

import io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.request.UserRequestDTO;
import io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.response.UserResponseDTO;
import io.quind.prueba.prestamolibro.adapters.inbound.http.handlers.IUserHandler;
import io.quind.prueba.prestamolibro.adapters.inbound.http.mappers.IUserRequestMapper;
import io.quind.prueba.prestamolibro.domain.api.IUserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserHandlerImpl implements IUserHandler {
    private final IUserServicePort userServicePort;
    private final IUserRequestMapper userRequestMapper;
    @Override
    public void createUser(UserRequestDTO userRequestDTO) {
        this.userServicePort.createUser(userRequestMapper.toUser(userRequestDTO));
    }

    @Override
    public void updateUser(UserRequestDTO userRequestDTO) {
        this.userServicePort.updateUser(userRequestMapper.toUser(userRequestDTO));
    }

    @Override
    public Optional<UserResponseDTO> getAllUser() {
        return Optional.empty();
    }

    @Override
    public void deleteUserById(Long userId) {
        this.userServicePort.deleteUserById(userId);
    }


}
