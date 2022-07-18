package com.credibanco.assessment.card.dto;

import java.io.Serializable;

public class EliminarTarjetaResponse implements Serializable {

    private String codigoRespuesta;
    private String mensaje;
    public EliminarTarjetaResponse(String codigoRespuesta, String mensaje) {
        this.codigoRespuesta = codigoRespuesta;
        this.mensaje = mensaje;
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
}
