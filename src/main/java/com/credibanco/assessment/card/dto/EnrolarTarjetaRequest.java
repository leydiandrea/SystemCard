package com.credibanco.assessment.card.dto;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "identificadorSistema",
        "numeroValidacion"
})
@Generated("jsonschema2pojo")
public class EnrolarTarjetaRequest implements Serializable {

    @JsonProperty("identificadorSistema")
    @NotNull
    private String identificadorSistema;
    @JsonProperty("numeroValidacion")
    @NotNull
    private Integer numeroValidacion;
    @JsonIgnore
    @NotNull
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("identificadorSistema")
    public String getIdentificadorSistema() {
        return identificadorSistema;
    }

    @JsonProperty("identificadorSistema")
    public void setIdentificadorSistema(String identificadorSistema) {
        this.identificadorSistema = identificadorSistema;
    }

    @JsonProperty("numeroValidacion")
    public Integer getNumeroValidacion() {
        return numeroValidacion;
    }

    @JsonProperty("numeroValidacion")
    public void setNumeroValidacion(Integer numeroValidacion) {
        this.numeroValidacion = numeroValidacion;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}