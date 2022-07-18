package com.credibanco.assessment.card.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "identificadorSistema",
        "numeroValidacion",
        "pan",
})
@Generated("jsonschema2pojo")
public class EliminarTarjetaRequest implements Serializable {
    @JsonProperty("identificadorSistema")
    @NotNull
    private String identificadorSistema;
    @JsonProperty("numeroValidacion")
    @NotNull
    private Long numeroValidacion;
    @JsonProperty("pan")
    @NotNull
    private Long pan;

    public String getIdentificadorSistema() {
        return identificadorSistema;
    }

    public void setIdentificadorSistema(String identificadorSistema) {
        this.identificadorSistema = identificadorSistema;
    }

    public Long getNumeroValidacion() {
        return numeroValidacion;
    }

    public void setNumeroValidacion(Long numeroValidacion) {
        this.numeroValidacion = numeroValidacion;
    }

    public Long getPan() {
        return pan;
    }

    public void setPan(Long pan) {
        this.pan = pan;
    }
}
