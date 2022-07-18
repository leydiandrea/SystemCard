package com.credibanco.assessment.card.service;

import com.credibanco.assessment.card.dto.CrearTarjetaRequest;
import com.credibanco.assessment.card.dto.CrearTarjetaResponse;
import com.credibanco.assessment.card.dto.EliminarTarjetaRequest;
import com.credibanco.assessment.card.dto.EnrolarTarjetaRequest;
import com.credibanco.assessment.card.model.TarjetaEntity;

import java.util.List;
import java.util.Optional;

public interface TarjetaService {

    public CrearTarjetaResponse crearTarjeta(CrearTarjetaRequest request);
    public String enmascarar(String pan);
    public Object EnrolarTarjeta(EnrolarTarjetaRequest request);
    public Optional<TarjetaEntity> consultarTarjeta(String id);
    public Object eliminarTarjeta(EliminarTarjetaRequest request);
    public List<TarjetaEntity> consultarTodo();
}
