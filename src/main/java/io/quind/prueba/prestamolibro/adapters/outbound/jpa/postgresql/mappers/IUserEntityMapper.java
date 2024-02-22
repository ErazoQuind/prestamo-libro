package io.quind.prueba.prestamolibro.adapters.outbound.jpa.postgresql.mappers;

import io.quind.prueba.prestamolibro.adapters.outbound.jpa.postgresql.entities.UserEntity;
import io.quind.prueba.prestamolibro.domain.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserEntityMapper {
    UserEntity toEntity(User user);
}
