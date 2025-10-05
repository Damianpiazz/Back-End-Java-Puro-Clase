package org.example.c5;

import org.example.c5.clases.Cliente;
import org.example.c5.clases.Producto;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Damian Piazza", "damipiazza11@gmail.com");
        cliente1.mostrarInformacion();

        Producto producto1 = new Producto("Laptop", 1500.0, 5);
        Producto producto2 = new Producto("Auriculares", 500.0, 10);

        // Mostrar información de los productos
        System.out.println("\n--- Información de Productos ---");
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();

        // Calcular descuento
        System.out.println("\n--- Descuentos ---");
        System.out.println("Precio original de " + producto1 + ": $" + producto1.calcularDescuento());
        System.out.println("Precio con descuento (Laptop): $" + producto1.calcularDescuento());
        System.out.println("Precio con descuento (Auriculares): $" + producto2.calcularDescuento());

        // Crear varios clientes usando el constructor
        System.out.println("\n--- Lista de Clientes ---");
        Cliente cliente2 = new Cliente("Ana Gómez", "ana.gomez@example.com");
        Cliente cliente3 = new Cliente("Carlos López", "carlos.lopez@example.com");

        cliente2.mostrarInformacion();
        cliente3.mostrarInformacion();
    }
}
