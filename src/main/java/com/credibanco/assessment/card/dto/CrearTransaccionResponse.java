package com.credibanco.assessment.card.dto;

import java.io.Serializable;

public class CrearTransaccionResponse implements Serializable {

    private String codigoRespuesta;
    private String mensaje;
    private String estadoTransaccion;
    private Long numeroReferencia;

    public CrearTransaccionResponse(String codigoRespuesta, String mensaje, String estadoTransaccion, Long numeroReferencia) {
        this.codigoRespuesta = codigoRespuesta;
        this.mensaje = mensaje;
        this.estadoTransaccion = estadoTransaccion;
        this.numeroReferencia = numeroReferencia;
    }

    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    public void setCodigoRespuesta(String codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEstadoTransaccion() {
        return estadoTransaccion;
    }

    public void setIdentificadorSistema(String identificadorSistema) {
        this.numeroReferencia = numeroReferencia;
    }

    public void setEstadoTransaccion(String estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }

    public Long getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(Long numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }
}
