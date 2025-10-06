package org.example.pre_entrega.excepciones;

public class StockInsuficienteException extends RuntimeException {
  public StockInsuficienteException(String message) {
    super(message);
  }
}
