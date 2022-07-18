package com.credibanco.assessment.card.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class AnularTransaccionRequest implements Serializable {

    @NotNull(message = "Id es necesario")
    private Long identificador_sistema;

    @NotNull(message = "Numero de referencia necesario")
    private Long numero_referencia;

    @NotNull(message = "Total de la compra es necesario")
    private Long total_compra;

    public Long getIdentificador_sistema() {
        return identificador_sistema;
    }

    public void setIdentificador_sistema(Long identificador_sistema) {
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
}
