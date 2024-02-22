package io.quind.prueba.prestamolibro.adapters.inbound.http.controllers;

import io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.request.UserRequestDTO;
import io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.response.UserResponseDTO;
import io.quind.prueba.prestamolibro.adapters.inbound.http.handlers.IUserHandler;
import io.quind.prueba.prestamolibro.configuration.Constants;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final IUserHandler userHandler;

    @PostMapping
    public ResponseEntity<Map<String,String>> createCustomer(@Valid @RequestBody UserRequestDTO userRequestDTO){
        userHandler.createUser(userRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,Constants.USER_CREATED_MESSAGE));
    }
}
