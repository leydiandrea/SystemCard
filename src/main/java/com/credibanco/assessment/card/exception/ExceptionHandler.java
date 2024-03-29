package com.credibanco.assessment.card.exception;

import com.credibanco.assessment.card.dto.CrearTarjetaResponse;
import com.credibanco.assessment.card.dto.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ResponseEntity<Object> exception(Exception exception) {
        return new ResponseEntity<>(new ExceptionResponse("04" , exception.getMessage() , "ERROR INESPERADO"), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
