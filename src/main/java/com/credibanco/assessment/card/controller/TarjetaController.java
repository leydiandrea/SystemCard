package com.credibanco.assessment.card.controller;

import com.credibanco.assessment.card.dto.CrearTarjetaResponse;
import com.credibanco.assessment.card.dto.EliminarTarjetaRequest;
import com.credibanco.assessment.card.model.TarjetaEntity;
import com.credibanco.assessment.card.service.TarjetaService;
import com.credibanco.assessment.card.service.impl.TarjetaServiceImpl;
import com.credibanco.assessment.card.dto.CrearTarjetaRequest;
import com.credibanco.assessment.card.dto.EnrolarTarjetaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarjeta")
public class TarjetaController {

    @Autowired
    private TarjetaService service;

    @PostMapping("/crear")
    public ResponseEntity<CrearTarjetaResponse> crear(@RequestBody @Valid CrearTarjetaRequest request) {
        return new ResponseEntity<>(service.crearTarjeta(request), HttpStatus.OK);
    }

    @PutMapping("/enrolar")
    public ResponseEntity<Object> enrolar(@RequestBody @Valid EnrolarTarjetaRequest request) {
        return new ResponseEntity<>(service.EnrolarTarjeta(request), HttpStatus.OK);
    }

    @GetMapping("/consultar/{id}")
    public ResponseEntity<Object> consultarTarjeta(@PathVariable(required=true,name="id")  String id) {  //funcion consultar recibe un id y retorna un object//
        Optional<TarjetaEntity> tarjetaOpcional  = service.consultarTarjeta(id)  ; //funcion consultar tarjeta recibe un id y retorna un opcional<tarjetaentity que se llama tarjeta o whereever//
        if (tarjetaOpcional.isPresent()){
            TarjetaEntity tarjeta = tarjetaOpcional.get();
            return new ResponseEntity<>(tarjeta ,HttpStatus.OK );
        }else{
            return new ResponseEntity<>( "404 not found " , HttpStatus.NOT_FOUND );
        }
    }

    @CrossOrigin //permite consultar un http en el mismo ordenador (front)
    @GetMapping("/consultar")
    public ResponseEntity<List<TarjetaEntity>> consultar() {
        return new ResponseEntity<>(service.consultarTodo(), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar")
    public Object eliminar(@RequestBody @Valid EliminarTarjetaRequest request) {
        return new ResponseEntity<>(service.eliminarTarjeta (request), HttpStatus.OK);
    }


}
