package org.example.c6.clases;

import java.util.ArrayList;

public class Carrito {
    private final ArrayList<Producto> productos;

    // Constructor
    public Carrito() {
        productos = new ArrayList<>();
    }

    // Agregar producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    // Calcular el total
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    // Mostrar productos
    public void mostrarProductos() {
        System.out.println("\nProductos en el carrito:");
        for (Producto p : productos) {
            System.out.println("- " + p);
        }
    }
}
