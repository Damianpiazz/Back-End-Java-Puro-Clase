package org.example.c5.clases;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // Constructor
    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + cantidadEnStock);
    }

    // Metodo para calcular un descuento del 10%
    public double calcularDescuento() {
        return precio * 0.9; // Aplica el 10% de descuento
    }
}
