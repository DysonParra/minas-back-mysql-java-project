/*
 * @fileoverview    {CodigoOrigenRestAssembler}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.api.web.rest.assembler;

import com.project.dev.api.dto.CodigoOrigenDTO;
import com.project.dev.api.web.rest.CodigoOrigenRest;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

/**
 * TODO: Definición de {@code CodigoOrigenRestAssembler}.
 *
 * @author Dyson Parra
 * @since 11
 */
@Component
public class CodigoOrigenRestAssembler implements RepresentationModelAssembler<CodigoOrigenDTO, EntityModel<CodigoOrigenDTO>> {

    /**
     * Convierte un DTO en un modelo.
     *
     * @param entityDTO DTO a convertir.
     * @return el modelo correspondiente al DTO:
     */
    @Override
    public EntityModel<CodigoOrigenDTO> toModel(CodigoOrigenDTO entityDTO) {
        return new EntityModel<>(entityDTO,
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CodigoOrigenRest.class).getEntity(String.valueOf(entityDTO.getIntId()))).withSelfRel(),
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CodigoOrigenRest.class).getAllEntities()).withRel("CodigoOrigen"));
    }
}
