package com.credibanco.assessment.card.dto;

public class ExceptionResponse {

    private String code;
    private String message;
    private String trace;

    public ExceptionResponse(String code, String message, String trace) {
        this.code = code;
        this.message = message;
        this.trace = trace;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }
}
