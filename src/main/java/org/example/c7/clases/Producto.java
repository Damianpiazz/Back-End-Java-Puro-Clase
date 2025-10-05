package org.example.c7.clases;

public abstract class Producto {
    protected String nombre;
    protected double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal();

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio base: $" + precioBase);
    }
}
