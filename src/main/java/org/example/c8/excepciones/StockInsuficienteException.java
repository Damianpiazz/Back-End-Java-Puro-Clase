package org.example.c8.excepciones;

public class StockInsuficienteException extends RuntimeException {
  public StockInsuficienteException(String message) {
    super(message);
  }
}
