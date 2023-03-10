/*
 * @fileoverview    {TemporalDTO} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.api.dto;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Definición de {@code TemporalDTO}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class TemporalDTO {

    private Integer intIdTemporal;
    private String strPlaca;
    private String strRfid;
    private String strProveedor;
    private String strTope;
    private Integer intAcumulado;
    private Date dtFechaEntrada;
    private Date dtFechaSalida;
    private String strEstado;

}
