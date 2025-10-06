package org.example.pre_entrega.excepciones;

public class ProductoNoEncontradoException extends RuntimeException {
  public ProductoNoEncontradoException(String message) {
    super(message);
  }
}
