package org.example.c8.productos;

public class Comida extends Producto {
    private final double pesoGramos;

    public Comida(String nombre, double precio, int stock, double pesoGramos) {
        super(nombre, precio, stock);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public String toString() {
        return super.toString() + " - Peso: " + pesoGramos + "g";
    }
}