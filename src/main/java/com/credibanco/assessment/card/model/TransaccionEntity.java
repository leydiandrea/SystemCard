package com.credibanco.assessment.card.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "Transaccion")
@Table(name = "\"Transaccion\"", schema = "SystemCard")
public class TransaccionEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @Column(name = "identificador_sistema", nullable = false)
    private String identificador_sistema;

    @Id
    @Column(name = "numero_referencia", nullable = false)
    private Long numero_referencia;

    @Column(name = "total_compra", nullable = false)
    private Long total_compra;

    @Column(name = "direccion_compra", nullable = false)
    private String direccion_compra;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "creation_date", nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp date;
    public Timestamp getDate() {
        return date;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

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

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
