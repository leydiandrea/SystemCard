package com.credibanco.assessment.card.controller;

import com.credibanco.assessment.card.dto.AnularTransaccionRequest;
import com.credibanco.assessment.card.dto.AnularTransaccionResponse;
import com.credibanco.assessment.card.dto.CrearTransaccionRequest;
import com.credibanco.assessment.card.dto.CrearTransaccionResponse;
import com.credibanco.assessment.card.model.TransaccionEntity;
import com.credibanco.assessment.card.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/transaccion")
public class TransaccionController {

    @Autowired
    private TransaccionService service;

    @PostMapping("/crear")
    public ResponseEntity<CrearTransaccionResponse> crear(@RequestBody @Valid CrearTransaccionRequest request) {
        return new ResponseEntity<>(service.crearTransaccion(request), HttpStatus.OK);
    }

    @CrossOrigin //permite consultar htpp en el mismo ordenador
    @GetMapping("/consultar")
    public ResponseEntity<List<TransaccionEntity>> consultar() {
        return new ResponseEntity<>(service.consultarTodo(), HttpStatus.OK);
    }

    @PutMapping("/anular")
    public ResponseEntity<AnularTransaccionResponse> anular(@RequestBody @Valid  AnularTransaccionRequest request) {
        return new ResponseEntity<>(service.anularTransaccion(request), HttpStatus.OK);
    }

}

