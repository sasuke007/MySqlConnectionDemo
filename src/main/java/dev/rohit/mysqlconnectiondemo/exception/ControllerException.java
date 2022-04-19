package dev.rohit.mysqlconnectiondemo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import java.util.Optional;

@ControllerAdvice
public class ControllerException{

  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  @ExceptionHandler(MySqlConnectionDemoException.class)
  public ResponseEntity handleNotFoundException(RuntimeException ex, HttpHeaders headers,
      HttpStatus status, WebRequest request){
    return ResponseEntity.of(Optional.empty());
  }
}
