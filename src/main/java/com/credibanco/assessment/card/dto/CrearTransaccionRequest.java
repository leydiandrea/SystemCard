package com.credibanco.assessment.card.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "identificador_sistema",
        "numero_referencia",
        "total_compra",
        "direccion_compra"
})
@Generated("jsonschema2pojo")
public class CrearTransaccionRequest implements Serializable {

    @JsonProperty("identificador_sistema")
    @NotNull
    private String identificador_sistema;

    @JsonProperty("numero_referencia")
    @NotNull
    private Long numero_referencia;

    @JsonProperty("total_compra")
    @NotNull
    private Long total_compra;

    @JsonProperty("direccion_compra")
    @NotNull
    private String direccion_compra;

    public String getIdentificador_sistema() {
        return identificador_sistema;
    }

    public void setIdentificador_sistema(String identificador_sistema) {
        this.identificador_sistema = identificador_sistema;
    }

    public Long getNumero_referencia() {
        return numero_referencia;
    }

    public void setNumero_referencia(Long numero_referencia) {
        this.numero_referencia = numero_referencia;
    }

    public Long getTotal_compra() {
        return total_compra;
    }

    public void setTotal_compra(Long total_compra) {
        this.total_compra = total_compra;
    }

    public String getDireccion_compra() {
        return direccion_compra;
    }

    public void setDireccion_compra(String direccion_compra) {
        this.direccion_compra = direccion_compra;
    }
}