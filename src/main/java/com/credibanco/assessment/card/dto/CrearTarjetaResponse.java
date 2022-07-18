package com.credibanco.assessment.card.dto;

import java.io.Serializable;

public class CrearTarjetaResponse implements Serializable {

    private String codigoRespuesta;
    private String mensaje;
    private int numeroValidacion;
    private String pan;
    private String identificadorSistema;

    public CrearTarjetaResponse(String codigoRespuesta, String mensaje, int numeroValidacion, String pan, String identificadorSistema) {
        this.codigoRespuesta = codigoRespuesta;
        this.mensaje = mensaje;
        this.numeroValidacion = numeroValidacion;
        this.pan = pan;
        this.identificadorSistema = identificadorSistema;
    }

    public CrearTarjetaResponse(String codigoRespuesta, String mensaje, String pan) {
        this.codigoRespuesta = codigoRespuesta;
        this.mensaje = mensaje;
        this.pan = pan;
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

    public String getIdentificadorSistema() {
        return identificadorSistema;
    }

    public void setIdentificadorSistema(String identificadorSistema) {
        this.identificadorSistema = identificadorSistema;
    }

    public int getNumeroValidacion() {
        return numeroValidacion;
    }

    public void setNumeroValidacion(int numeroValidacion) {
        this.numeroValidacion = numeroValidacion;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }
}
