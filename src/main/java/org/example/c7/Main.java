package org.example.c7;

import org.example.c7.clases.Cafe;
import org.example.c7.clases.Producto;
import org.example.c7.clases.Te;
import org.example.c7.interfaces.Descontable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Te("Té Verde", 100, true));
        productos.add(new Te("Té Negro", 80, false));
        productos.add(new Cafe("Café Espresso", 120, false));
        productos.add(new Cafe("Café Latte", 120, true));

        System.out.println("=== Lista de Productos ===");
        for (Producto producto : productos) {
            producto.mostrarInformacion();
            System.out.println("Precio final: $" + producto.calcularPrecioFinal());
            System.out.println("--------------------------");
        }

        System.out.println("=== Aplicando Descuentos ===");
        for (Producto producto : productos) {
            if (producto instanceof Descontable) {
                ((Descontable) producto).aplicarDescuento(10); // 10% de descuento
                System.out.println("Nuevo precio final de " + producto.getNombre() +
                        ": $" + producto.calcularPrecioFinal());
            }
        }
    }
}
