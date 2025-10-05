package org.example.c6.clases;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // Variable estatica para contar productos creados
    private static int contadorProductos = 0;

    // Constructor
    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        setCantidadEnStock(cantidadEnStock); // usamos el setter para validar
        contadorProductos++; // incrementamos al crear
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        if (cantidadEnStock >= 0) {
            this.cantidadEnStock = cantidadEnStock;
        } else {
            System.out.println("La cantidad en stock no puede ser negativa.");
        }
    }

    // Metodo estático para obtener la cantidad de productos creados
    public static int getContadorProductos() {
        return contadorProductos;
    }

    @Override
    public String toString() {
        return nombre + " | Precio: $" + precio + " | Stock: " + cantidadEnStock;
    }
}
