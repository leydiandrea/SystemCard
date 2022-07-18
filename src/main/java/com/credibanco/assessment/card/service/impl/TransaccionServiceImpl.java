package com.credibanco.assessment.card.service.impl;

import com.credibanco.assessment.card.dto.*;
import com.credibanco.assessment.card.model.TarjetaEntity;
import com.credibanco.assessment.card.model.TransaccionEntity;
import com.credibanco.assessment.card.repository.TarjetaRepository;
import com.credibanco.assessment.card.repository.TransaccionRepository;
import com.credibanco.assessment.card.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class TransaccionServiceImpl implements TransaccionService {

    @Autowired
    private TransaccionRepository transaccionRepository;
    @Autowired
    private TarjetaRepository tarjetaRepository;

    public CrearTransaccionResponse crearTransaccion(CrearTransaccionRequest request) {
        Optional<TarjetaEntity> result = tarjetaRepository.findById(request.getIdentificador_sistema());
        if (result.isPresent()) {
            if (result.get().getEstado().equals("ENROLADA")){
                TransaccionEntity transc = new TransaccionEntity();
                transc.setIdentificador_sistema(request.getIdentificador_sistema());
                transc.setNumero_referencia(request.getNumero_referencia());
                transc.setTotal_compra(request.getTotal_compra());
                transc.setDireccion_compra(request.getDireccion_compra());
                transc.setEstado("Aprobada");
                transaccionRepository.save(transc);
                return new CrearTransaccionResponse("00", "Compra exitosa", "Aprobada", request.getNumero_referencia());
            }else { return new CrearTransaccionResponse("02", "Tarjeta no enrolada", "Rechazada", request.getNumero_referencia());

            }
        }else { return new CrearTransaccionResponse("01", "Tarjeta no existe", "Rechazada", request.getNumero_referencia());
        }
    }

    public List<TransaccionEntity> consultarTodo() {
        return transaccionRepository.findAll();
    }

    public AnularTransaccionResponse anularTransaccion(AnularTransaccionRequest request) {
        Optional<TransaccionEntity> result = transaccionRepository.findById(request.getNumero_referencia());
        if (result.isPresent()) {
            if (result.get().getNumero_referencia().equals(request.getNumero_referencia())) {
                System.out.println(new Timestamp(System.currentTimeMillis()).getTime() - result.get().getDate().getTime());
                if ((new Timestamp(System.currentTimeMillis()).getTime() - result.get().getDate().getTime()) < 300000){
                    result.get().setEstado("Compra anulada");
                    transaccionRepository.save(result.get());
                    return new  AnularTransaccionResponse("00", "Compra anulada", request.getNumero_referencia());
                }
                return new  AnularTransaccionResponse("01", "Fecha de anulacion(5m) expiro", request.getNumero_referencia());

            }
            return new  AnularTransaccionResponse("01", "numero de referencia inválido", request.getNumero_referencia());
        }
        return new  AnularTransaccionResponse("02", "No se puede anular transacción", request.getNumero_referencia());
    }
}
