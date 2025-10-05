package org.example.clase_2;

import java.util.Scanner;

public class Ejercicio_clase_2 {
    public static void main(String[] args) {
        // ----------------------------
        // 1. Variables y Operadores
        // ----------------------------
        double precioProducto = 50.0;       // precio fijo por unidad
        int cantidadDeseada = 20;           // cantidad inicial
        double costoTotal = precioProducto * cantidadDeseada;

        System.out.println("=== Variables y Operadores ===");
        System.out.println("Precio del producto: $" + precioProducto);
        System.out.println("Cantidad deseada: " + cantidadDeseada);
        System.out.println("Costo total: $" + costoTotal);

        // Modificamos la cantidad para verificar el resultado
        cantidadDeseada = 35;
        costoTotal = precioProducto * cantidadDeseada;
        System.out.println("Nueva cantidad: " + cantidadDeseada);
        System.out.println("Nuevo costo total: $" + costoTotal);

        // ----------------------------
        // 2. Entrada y Salida de Datos
        // ----------------------------
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n=== Entrada y Salida de Datos ===");
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese la cantidad de productos que desea comprar: ");
        int cantidadComprada = entrada.nextInt();

        double totalCompra = cantidadComprada * precioProducto;
        System.out.println("Hola " + nombre + ", el total de tu compra es: $" + totalCompra);

        // ----------------------------
        // 3. Condicionales
        // ----------------------------
        System.out.println("\n=== Condicionales ===");
        if (cantidadComprada > 100) {
            System.out.println("¡Felicidades! Aplica un DESCUENTO ESPECIAL por comprar más de 100 unidades.");
        } else {
            System.out.println("No aplica descuento especial.");
        }

        // ----------------------------
        // 4. Bucles
        // ----------------------------
        System.out.println("\n=== Bucles ===");
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        // Bucle for
        System.out.println("\nUsando FOR:");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        // Bucle while
        System.out.println("\nUsando WHILE:");
        int i = 1;
        while (i <= numero) {
            System.out.println(i);
            i++;
        }

        entrada.close();
    }
}
