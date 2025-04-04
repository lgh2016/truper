package com.test.app.mapper;

import com.test.app.dto.SucursaleDto;
import com.test.app.entity.Sucursale;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface SucursaleMapper {
    Sucursale toEntity(SucursaleDto sucursaleDto);

    SucursaleDto toDto(Sucursale sucursale);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Sucursale partialUpdate(SucursaleDto sucursaleDto, @MappingTarget Sucursale sucursale);
}