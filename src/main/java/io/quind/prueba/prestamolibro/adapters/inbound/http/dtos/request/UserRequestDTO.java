package io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRequestDTO {
    private String identificationNumber;
    private String name;
    private String lastName;
    private String mail;
    private String birthday;
}
