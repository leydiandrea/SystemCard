package com.credibanco.assessment.card.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "pan",
        "titular",
        "cedula",
        "tipo",
        "telefono"
})
@Generated("jsonschema2pojo")
public class CrearTarjetaRequest implements Serializable {

    @JsonProperty("pan")
    @NotNull
    private Long pan;
    @JsonProperty("titular")
    @NotNull
    private String titular;
    @JsonProperty("cedula")
    @NotNull
    private String cedula;
    @JsonProperty("tipo")
    @NotNull (message = "Mencione si es Debito o Credito")
    private String tipo;
    @JsonProperty("telefono")
    @NotNull
    private Long telefono;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pan")
    public Long getPan() {
        return pan;
    }

    @JsonProperty("pan")
    public void setPan(Long pan) {
        this.pan = pan;
    }

    @JsonProperty("titular")
    public String getTitular() {
        return titular;
    }

    @JsonProperty("titular")
    public void setTitular(String titular) {
        this.titular = titular;
    }

    @JsonProperty("cedula")
    public String getCedula() {
        return cedula;
    }

    @JsonProperty("cedula")
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @JsonProperty("tipo")
    public String getTipo() {
        return tipo;
    }

    @JsonProperty("tipo")
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @JsonProperty("telefono")
    public Long getTelefono() {
        return telefono;
    }

    @JsonProperty("telefono")
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
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
