package io.quind.prueba.prestamolibro.adapters.inbound.http.controllers;

import io.quind.prueba.prestamolibro.adapters.inbound.http.handlers.IUserHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final IUserHandler userHandler;


}
