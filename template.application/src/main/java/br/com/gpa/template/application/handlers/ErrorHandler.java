package br.com.gpa.template.application.handlers;

import br.com.gpa.template.application.dtos.ErrorDto;

import br.com.gpa.template.domain.exceptions.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity defaultErrorHandler(Exception e) {
        log.error(e.getMessage());
        e.printStackTrace();

        String message = System.getenv("Environment").equals("Production")
                ? "Um erro inesperado ocorreu"
                : e.getMessage();

        ErrorDto error = new ErrorDto(message);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity defaultErrorHandler(NotFoundException e) {
        log.error(e.getMessage());
        e.printStackTrace();

        ErrorDto error = new ErrorDto(e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
