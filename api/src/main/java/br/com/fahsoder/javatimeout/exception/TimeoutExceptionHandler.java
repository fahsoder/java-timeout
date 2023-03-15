package br.com.fahsoder.javatimeout.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.SocketTimeoutException;

@ControllerAdvice
public class TimeoutExceptionHandler {

    @ExceptionHandler(SocketTimeoutException.class)
    public ResponseEntity<String> handleTimeoutException(SocketTimeoutException ex) {
        return ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).body("O tempo limite de resposta foi atingido.");
    }
}