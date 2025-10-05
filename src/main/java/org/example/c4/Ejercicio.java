package org.example.c4;

import java.util.Arrays;

public class Ejercicio {

    public static double calcularImpuesto(double precio, double porcentajeImpuesto) {
        double impuesto = precio * (porcentajeImpuesto / 100);
        return precio + impuesto;
    }

    public static double calcularPrecioFinal(double precio, double descuento, int cantidad) {
        if (cantidad > 50) {
            descuento += 5; // Se agrega 5% extra si la cantidad es mayor a 50
        }
        double descuentoCalculado = precio * (descuento / 100);
        return precio - descuentoCalculado;
    }

    public static void reponerStock(int[] stock, int indiceProducto, int cantidad) {
        if (indiceProducto >= 0 && indiceProducto < stock.length) {
            stock[indiceProducto] += cantidad;
            System.out.println("Stock actualizado del producto " + indiceProducto +
                    ": " + stock[indiceProducto] + " unidades.");
        } else {
            System.out.println("Índice fuera de rango, no se puede reponer stock.");
        }
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    public static void mostrarMensaje(String mensaje, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("Mensaje (" + (i + 1) + "): " + mensaje);
        }
    }

    public static void main(String[] args) {

        double precioBase = 1000.0;
        double precioConImpuesto = calcularImpuesto(precioBase, 21.0);
        System.out.println("Precio con 21% de impuesto: $" + precioConImpuesto);

        double precioFinal = calcularPrecioFinal(500.0, 10.0, 60);
        System.out.println("Precio final con descuento aplicado: $" + precioFinal);

        int[] stock = {10, 5, 0}; // stock inicial de 3 productos
        System.out.println("📦 Stock inicial: " + Arrays.toString(stock));
        reponerStock(stock, 1, 20); // repone stock al producto de indice 1
        System.out.println("📦 Stock final: " + Arrays.toString(stock));

        mostrarMensaje("Bienvenido nuevo cliente");
        mostrarMensaje("Gracias por volver, cliente VIP", 3);
    }
}
