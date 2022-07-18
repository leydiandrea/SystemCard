package com.credibanco.assessment.card.service.impl;

import com.credibanco.assessment.card.dto.*;
import com.credibanco.assessment.card.model.TarjetaEntity;
import com.credibanco.assessment.card.repository.TarjetaRepository;
import com.credibanco.assessment.card.service.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class TarjetaServiceImpl implements TarjetaService {

    @Autowired
    private TarjetaRepository tarjetaRepository;

    public CrearTarjetaResponse crearTarjeta(CrearTarjetaRequest request) {
        int min = 1;
        int max = 100;
        Random random = new Random();
        int numeroAleatorio = random.nextInt(max + min) + min; //genera un numero aleatorio entre 1 y 100
        TarjetaEntity t = new TarjetaEntity();
        try{
            t.setCedula(request.getCedula());
            t.setPan(request.getPan());
            t.setTelefono(request.getTelefono());
            t.setTipo(request.getTipo());
            t.setTitular(request.getTitular());
            t.setNumeroValidacion(numeroAleatorio);
            t.setHash(String.valueOf(request.getPan().hashCode()));//se genera el hash de la pan usando la funcion hashcode, es nativa de java.
            t.setId(t.getHash());
            t.setEstado("CREADA");
             tarjetaRepository.save(t);
            return new CrearTarjetaResponse("00", "exito", numeroAleatorio, enmascarar(t.getPan().toString()), t.getHash());
        }catch (Exception e ){
           // e.printStackTrace(); Opcion de imprimir una excepcion
            return new CrearTarjetaResponse("01", "fallido", numeroAleatorio,  t.getPan() != null ? enmascarar(t.getPan().toString()) : "NA", t.getHash() != null ? t.getHash() : "NA" );
        }

    }

    public String enmascarar(String pan) {
        return pan.substring(0, 6) + "****" + pan.substring(pan.length() - 4, pan.length());
    }

    public Object EnrolarTarjeta(EnrolarTarjetaRequest request) {
        Optional<TarjetaEntity> result = tarjetaRepository.findById(request.getIdentificadorSistema());
        if (result.isPresent()) {
            if (result.get().getNumeroValidacion() == request.getNumeroValidacion()) {
                result.get().setEstado("ENROLADA");
                tarjetaRepository.save(result.get());
                return new CrearTarjetaResponse("00", "exito",  enmascarar(result.get().getPan().toString()));
            }else{
                return new CrearTarjetaResponse("02", "Número de validación inválido),",  enmascarar(result.get().getPan().toString()));
            }
        }
        return new CrearTarjetaResponse("01", "Tarjeta no existe", result.isPresent() ? enmascarar( result.get().getPan().toString()) : "NA");

    }

    public Optional<TarjetaEntity> consultarTarjeta(String id) {
        Optional<TarjetaEntity> result = tarjetaRepository.findById(id);
        System.out.println(result.toString());
        return result;

    }

    public Object eliminarTarjeta(EliminarTarjetaRequest request) {
        Optional<TarjetaEntity> result = tarjetaRepository.findById(request.getIdentificadorSistema());
        if (result.isPresent()) {
            tarjetaRepository.deleteById(request.getIdentificadorSistema());
            return new EliminarTarjetaResponse("00", "Se ha eliminado la tarjeta");
        } else {
            return new EliminarTarjetaResponse("01", "No se ha eliminado la tarjeta");
        }
    }

    public List<TarjetaEntity> consultarTodo() {
        return tarjetaRepository.findAll();
    }
}
