package com.credibanco.assessment.card.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Constraint;
import javax.validation.Valid;
import java.sql.Timestamp;

@Entity(name = "Tarjeta")
@Table(name = "\"Tarjeta\"", schema = "SystemCard")
public class TarjetaEntity {

    @Id//   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "pan", nullable = false)
    private Long Pan;
    @Column(name = "numeroValidacion", nullable = false)
    private Integer numeroValidacion;
    @Column(name = "hash", nullable = false)
    private String hash;

    @Column(name = "titular", nullable = false)
    private String titular;
    @Column(name = "cedula", nullable = false)
    private String cedula;
    @Column(name = "tipo", nullable = false)
    private String tipo;
    @Column(name = "telefono", nullable = false)
    private Long telefono;

    @Column(name = "estado", nullable = false)
    private String estado;
    @Column(name = "creation_date", nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp date;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Long getPan() {
        return Pan;
    }

    public void setPan(Long pan) {
        Pan = pan;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public int getNumeroValidacion() {
        return numeroValidacion;
    }

    public void setNumeroValidacion(int numeroValidacion) {
        this.numeroValidacion = numeroValidacion;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
