/*
 * @fileoverview    {VehiculoEnTransitoDTO}
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
 * TODO: Definición de {@code VehiculoEnTransitoDTO}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class VehiculoEnTransitoDTO {

    private Integer intIdEntrada;
    private Integer intIdParque;
    private String strTransporte;
    private String strTicket;
    private String strMatricula;
    private String strVagon;
    private Date dtFechaEntrada;
    private Date dtFechaSalida;
    private String strCombustible;
    private String strTipoMovimiento;
    private String strNombre;
    private String strParvaAnterior;
    private Date dtFechaFinParva;
    private String strPatio;
    private Date dtFechaInicioParva;
    private String strMuestras;
    private String strNroBolsa;
    private String strCodigoPartida;
    private String strConsecutivoVehiculo;
    private Integer intPesoEntrada;
    private Integer intPesoSalida;
    private Integer intPesoNeto;
    private String strUnidad;
    private String strDescripcion;
    private String txtRutaFotos;
    private String strRfid;
    private Boolean bitProcesoManual;
    private String strUsuario;
    private Boolean bitVehiculoDevuelto;
    private String strCif;
    private String strIdDestino;
    private String strIdOrigen;
    private String strEstado;
    private int intIdPorDia;

}
