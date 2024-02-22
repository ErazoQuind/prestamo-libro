package io.quind.prueba.prestamolibro.adapters.inbound.http.mappers;

import io.quind.prueba.prestamolibro.adapters.inbound.http.dtos.request.UserRequestDTO;
import io.quind.prueba.prestamolibro.domain.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserRequestMapper {
    User toUser(UserRequestDTO userRequestDTO);
}
