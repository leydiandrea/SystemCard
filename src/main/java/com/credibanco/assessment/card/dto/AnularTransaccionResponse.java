package com.credibanco.assessment.card.dto;

import java.io.Serializable;

public class AnularTransaccionResponse implements Serializable {

    private String codigoRespuesta;
    private String mensaje;
    private Long numeroReferencia;

    public AnularTransaccionResponse(String s, String compra_anulada, Long numeroReferencia) {
        this.codigoRespuesta = s;
        this.mensaje = compra_anulada;
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

    public Long getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(Long numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }
}
