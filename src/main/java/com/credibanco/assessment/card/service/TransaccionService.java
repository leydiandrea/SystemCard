package com.credibanco.assessment.card.service;

import com.credibanco.assessment.card.dto.AnularTransaccionRequest;
import com.credibanco.assessment.card.dto.AnularTransaccionResponse;
import com.credibanco.assessment.card.dto.CrearTransaccionRequest;
import com.credibanco.assessment.card.dto.CrearTransaccionResponse;
import com.credibanco.assessment.card.model.TransaccionEntity;

import java.util.List;

public interface TransaccionService {

    public CrearTransaccionResponse crearTransaccion(CrearTransaccionRequest request);
    public List<TransaccionEntity> consultarTodo();
    public AnularTransaccionResponse anularTransaccion(AnularTransaccionRequest request);
}
